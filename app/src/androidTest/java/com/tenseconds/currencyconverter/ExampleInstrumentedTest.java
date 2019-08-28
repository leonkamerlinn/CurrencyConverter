package com.tenseconds.currencyconverter;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.db.CurrencyDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    private Context appContext;
    private CurrencyDatabase database;

    @Before
    public void setup() {
        appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        database = CurrencyDatabase.getInstance(appContext);
        Currency.amount = 100;
        Currency.base = Currency.EUR;
    }




    @Test
    public void useAppContext() {
        assertEquals("com.tenseconds.currencyconverter", appContext.getPackageName());
    }


    @Test
    public void databaseTest() {
        database.currencyRatesDao().getCunrrencyRatesObservable().subscribe(currencyRates -> {
            Assert.assertTrue(currencyRates.AUD  > 0);
            Assert.assertTrue(currencyRates.USD  > 0);
            Assert.assertTrue(currencyRates.HRK  > 0);
            Assert.assertTrue(currencyRates.GBP  > 0);
            assertEquals(1, currencyRates.EUR, 0.0);

        });
    }

}
