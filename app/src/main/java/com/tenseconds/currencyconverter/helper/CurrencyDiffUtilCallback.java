package com.tenseconds.currencyconverter.helper;

import androidx.recyclerview.widget.DiffUtil;

import com.tenseconds.currencyconverter.api.Currency;

import java.util.List;


public class CurrencyDiffUtilCallback extends DiffUtil.Callback {
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
        return oldItem.equals(newItem);
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        Currency oldItem = mOldList.get(oldItemPosition);
        Currency newItem = mNewList.get(newItemPosition);
        System.out.println(oldItem.getValue());
        System.out.println(newItem.getValue());
        return oldItem.equals(newItem);
    }
}
