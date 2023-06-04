package com.example.customfonts.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class MontserratBlackTextView extends AppCompatTextView {
    public MontserratBlackTextView(Context context) {
        super(context);
        setFontsTextView();
    }

    public MontserratBlackTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public MontserratBlackTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getMontserratBlackTypeface(getContext());
        setTypeface(typeface);
    }
}
