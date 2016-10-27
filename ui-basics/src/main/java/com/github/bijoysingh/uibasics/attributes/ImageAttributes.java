package com.github.bijoysingh.uibasics.attributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.github.bijoysingh.uibasics.R;

/**
 * Image Attributes handler
 * Created by bijoy on 10/27/16.
 */

public class ImageAttributes {

  private Context context;
  private AttributeSet attributeSet;
  private int[] attrStyleable;
  private int srcStyleable;
  private int iconTintStyleable;
  private int iconPaddingStyleable;
  private int iconSizeStyleable;

  public ImageAttributes(Builder builder) {
    context = builder.context;
    attributeSet = builder.attributeSet;
    attrStyleable = builder.attrStyleable;
    srcStyleable = builder.srcStyleable;
    iconTintStyleable = builder.iconTintStyleable;
    iconPaddingStyleable = builder.iconPaddingStyleable;
    iconSizeStyleable = builder.iconSizeStyleable;
  }

  public void set(ImageView view) {
    TypedArray typedArray = context.getTheme().obtainStyledAttributes(
        attributeSet,
        attrStyleable,
        0, 0);

    try {

      int imageSrc = typedArray.getResourceId(srcStyleable, 0);
      if (imageSrc != 0) {
        view.setImageResource(imageSrc);
      }

      int tintColor = typedArray.getColor(iconTintStyleable, Color.GRAY);
      view.setColorFilter(tintColor);

      int padding = (int) typedArray.getDimension(iconPaddingStyleable, 0);
      view.setPadding(padding, padding, padding, padding);


      int size = (int) typedArray.getDimension(
          iconSizeStyleable,
          context.getResources().getDimension(R.dimen.default_icon));
      view.getLayoutParams().width = size;
      view.getLayoutParams().height = size;
    } finally {
      typedArray.recycle();
    }
  }

  public static class Builder {
    private Context context;
    private AttributeSet attributeSet;
    private int[] attrStyleable;
    private int srcStyleable;
    private int iconTintStyleable;
    private int iconPaddingStyleable;
    private int iconSizeStyleable;

    public Builder setContext(Context context) {
      this.context = context;
      return this;
    }

    public Builder setAttributeSet(AttributeSet attributeSet) {
      this.attributeSet = attributeSet;
      return this;
    }

    public Builder setAttrStyleable(int[] attrStyleable) {
      this.attrStyleable = attrStyleable;
      return this;
    }

    public Builder setSrcStyleable(int srcStyleable) {
      this.srcStyleable = srcStyleable;
      return this;
    }

    public Builder setIconTintStyleable(int iconTintStyleable) {
      this.iconTintStyleable = iconTintStyleable;
      return this;
    }

    public Builder setIconPaddingStyleable(int iconPaddingStyleable) {
      this.iconPaddingStyleable = iconPaddingStyleable;
      return this;
    }

    public Builder setIconSizeStyleable(int iconSizeStyleable) {
      this.iconSizeStyleable = iconSizeStyleable;
      return this;
    }

    public ImageAttributes build() {
      return new ImageAttributes(this);
    }
  }
}
