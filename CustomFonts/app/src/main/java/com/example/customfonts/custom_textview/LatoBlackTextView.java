package com.example.customfonts.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class LatoBlackTextView extends AppCompatTextView {
    public LatoBlackTextView(Context context) {
        super(context);
        setFontsTextView();
    }

    public LatoBlackTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public LatoBlackTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getLatoBlackTypeface(getContext());
        setTypeface(typeface);
    }
}
