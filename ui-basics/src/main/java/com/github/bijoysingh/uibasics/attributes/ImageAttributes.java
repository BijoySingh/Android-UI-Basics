package com.github.bijoysingh.uibasics.attributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.bijoysingh.uibasics.R;

/**
 * Image Attributes handler
 * Created by bijoy on 10/27/16.
 */

public class ImageAttributes {
  public static void set(Context context, AttributeSet attrs, ImageView view) {
    TypedArray typedArray = context.getTheme().obtainStyledAttributes(
        attrs,
        R.styleable.ImageAttributes,
        0, 0);

    try {
      view.setImageResource(typedArray.getResourceId(
          R.styleable.ImageAttributes_src, 0));
      view.setColorFilter(typedArray.getColor(
          R.styleable.ImageAttributes_iconTint, Color.WHITE));
      int padding = (int) typedArray.getDimension(
          R.styleable.ImageAttributes_iconPadding, 0);
      view.setPadding(padding, padding, padding, padding);
      int size = (int) typedArray.getDimension(
          R.styleable.ImageAttributes_iconSize, 0);
      view.getLayoutParams().width = size;
      view.getLayoutParams().height = size;
    } finally {
      typedArray.recycle();
    }
  }
}
