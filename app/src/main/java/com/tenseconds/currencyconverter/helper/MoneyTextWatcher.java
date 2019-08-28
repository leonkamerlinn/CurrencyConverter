package com.tenseconds.currencyconverter.helper;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MoneyTextWatcher implements TextWatcher {
    private final EditText mEditText;

    public MoneyTextWatcher(EditText editText) {

        mEditText = editText;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable editable) {
        mEditText.removeTextChangedListener(this);
        String text = mEditText.getText().toString();
        String newText = text.replace(",", ".");
        float num = Float.valueOf(newText);
        DecimalFormat df = new DecimalFormat("############.##");
        mEditText.setText(df.format(num));
        mEditText.addTextChangedListener(this);
    }
}
