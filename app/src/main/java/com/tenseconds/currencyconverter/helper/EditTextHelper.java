package com.tenseconds.currencyconverter.helper;

import android.content.Context;
import android.util.AttributeSet;

import com.google.android.material.textfield.TextInputEditText;

public class EditTextHelper extends TextInputEditText {
    public EditTextHelper(Context context) {
        super(context);
    }

    public EditTextHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EditTextHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        System.out.println(selStart);
        System.out.println(selEnd);
    }


}
