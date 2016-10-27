package com.github.bijoysingh.uibasics.attributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import com.github.bijoysingh.uibasics.R;

/**
 * Text Attributes handling
 * Created by bijoy on 10/27/16.
 */

public class TextAttributes {
  public static void set(Context context, AttributeSet attrs, TextView view) {
    TypedArray typedArray = context.getTheme().obtainStyledAttributes(
        attrs,
        R.styleable.TextAttributes,
        0, 0);

    try {
      // Sets the label for the fig
      view.setText(typedArray.getText(R.styleable.TextAttributes_text));
      view.setTextSize(typedArray.getDimension(
          R.styleable.TextAttributes_textSize,
          context.getResources().getDimension(R.dimen.default_text_size)));
      view.setTextColor(typedArray.getColor(
          R.styleable.TextAttributes_textColor,
          Color.WHITE));
      if (Build.VERSION.SDK_INT < 23) {
        view.setTextAppearance(context, typedArray.getResourceId(
            R.styleable.TextAttributes_textStyle, 0));
      } else {
        view.setTextAppearance(typedArray.getResourceId(
            R.styleable.TextAttributes_textStyle, 0));
      }
    } finally {
      typedArray.recycle();
    }
  }
}
