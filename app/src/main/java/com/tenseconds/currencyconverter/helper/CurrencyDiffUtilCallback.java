package com.tenseconds.currencyconverter.helper;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import com.tenseconds.currencyconverter.api.Currency;

import java.util.List;


public class CurrencyDiffUtilCallback extends DiffUtil.Callback {
    private static final String EXTRA_ITEM_DESCRIPTION = "EXTRA_ITEM_DESCRIPTION";
    List<Currency> mNewList, mOldList;

    public CurrencyDiffUtilCallback(List<Currency> newList, List<Currency> oldList) {
        mNewList = newList;
        mOldList = oldList;
    }

    @Override
    public int getOldListSize() {
        return mOldList != null ? mOldList.size() : 0 ;
    }

    @Override
    public int getNewListSize() {
        return mNewList != null ? mNewList.size() : 0 ;
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        Currency oldItem = mOldList.get(oldItemPosition);
        Currency newItem = mNewList.get(newItemPosition);
        return oldItem.getFlagRes() == newItem.getFlagRes();
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_ITEM_DESCRIPTION, mNewList.get(newItemPosition).getValueFormat());
        return bundle;
    }



    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        Currency oldItem = mOldList.get(oldItemPosition);
        Currency newItem = mNewList.get(newItemPosition);
        return oldItem.getValue() == newItem.getValue();
    }
}
