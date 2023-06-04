package com.example.customfonts.custom_textview;

import android.content.Context;
import android.graphics.Typeface;

import org.jetbrains.annotations.Contract;

public class Utils {
    private static Typeface allerDisplayTypeface;
    private static Typeface greatVibesRegularTypeface;
    private static Typeface latoBlackTypeface;
    private static Typeface montserratBlackTypeface;
    private static Typeface ostrichSansBlackTypeface;

    @Contract(pure = true) public static Typeface getAllerDisplayTypeface(Context context) {
        if(allerDisplayTypeface == null) {
            allerDisplayTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/AllerDisplay.ttf");
        }
        return allerDisplayTypeface;
    }

    @Contract(pure = true) public static Typeface getGreatVibesRegularTypeface(Context context) {
        if(greatVibesRegularTypeface == null) {
            greatVibesRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/GreatVibes-Regular.otf");
        }
        return greatVibesRegularTypeface;
    }

    @Contract(pure = true) public static Typeface getLatoBlackTypeface(Context context) {
        if(latoBlackTypeface == null) {
            latoBlackTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Black.ttf");
        }
        return latoBlackTypeface;
    }

    @Contract(pure = true) public static Typeface getMontserratBlackTypeface(Context context) {
        if(montserratBlackTypeface == null) {
            montserratBlackTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Montserrat-Black.otf");
        }
        return montserratBlackTypeface;
    }

    @Contract(pure = true) public static Typeface getOstrichSansBlackTypeface(Context context) {
        if(ostrichSansBlackTypeface == null) {
            ostrichSansBlackTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/OstrichSans-Black.otf");
        }
        return ostrichSansBlackTypeface;
    }

}
