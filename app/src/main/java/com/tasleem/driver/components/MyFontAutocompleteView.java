package com.tasleem.driver.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

import com.tasleem.driver.R;
import com.tasleem.driver.utils.AppLog;


/**
 * @author Elluminati elluminati.in
 */
public class MyFontAutocompleteView extends AutoCompleteTextView {
    public static final String TAG = "MyFontAutocompleteView";
    private Typeface typeface;

    public MyFontAutocompleteView(Context context) {
        super(context);
    }

    public MyFontAutocompleteView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public MyFontAutocompleteView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomFont(context, attrs);
    }

    private void setCustomFont(Context ctx, AttributeSet attrs) {
        TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.app);
        String customFont = a.getString(R.styleable.app_customFont);
        setCustomFont(ctx, customFont);
        a.recycle();
    }

    private boolean setCustomFont(Context ctx, String asset) {
        try {
            if (typeface == null) {
                typeface = Typeface.createFromAsset(ctx.getAssets(), "fonts/Roboto_Regular_0.ttf");
            }

        } catch (Exception e) {
            AppLog.handleException(TAG, e);
            return false;
        }

        setTypeface(typeface);
        return true;
    }

}