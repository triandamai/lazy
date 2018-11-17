package com.trian.lazy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class TextView extends android.support.v7.widget.AppCompatTextView {
    public TextView(Context context) {
        this(context, null);
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.obtainStyledAttributes(attrs,
                R.styleable.CustomTextView, 0, 0);
        String path_font = array.getString(R.styleable.CustomTextView_fontPath);

        array.recycle();
        if (path_font != null) {
            setCustomTypeFace(context, path_font);
        } else {
            setCustomTypeFace(context, "fonts/Lato-Light.ttf");
        }
    }

    private void setCustomTypeFace(Context context, String path_font) {
        Typeface typeFaces = Typeface.createFromAsset(context.getAssets(), path_font);
}
}
