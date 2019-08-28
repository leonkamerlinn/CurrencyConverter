package com.tenseconds.currencyconverter.db;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@Database(entities = {CurrencyRates.class}, version = 1, exportSchema = false)
public abstract class CurrencyDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = CurrencyDatabase.class.getSimpleName();


    public abstract CurrencyRatesDao currencyRatesDao();


    // marking the instance as volatile to ensure atomic access to the variable
    private static volatile CurrencyDatabase INSTANCE;

    public static CurrencyDatabase getInstance(final Context context) {
        if (INSTANCE == null) {
            synchronized (CurrencyDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), CurrencyDatabase.class, DATABASE_NAME)

                            // Wipes and rebuilds instead of migrating if no Migration object.
                            // Migration is not part of this codelab.
                            //.fallbackToDestructiveMigration()
                            //.allowMainThreadQueries()
                            .addCallback(sRoomDatabaseCallback)
                            //.addMigrations(MIGRATION_1_2)
                            .build();
                }
            }
        }
        return INSTANCE;
    }





    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }

        @SuppressLint("CheckResult")
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            Observable.fromCallable(() -> {
                populateDatabase();
                return 1;
            })
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe();

        }
    };

    private static void populateDatabase() {


        INSTANCE.currencyRatesDao().insert(Currency.getDefaultRates());
    }
}
