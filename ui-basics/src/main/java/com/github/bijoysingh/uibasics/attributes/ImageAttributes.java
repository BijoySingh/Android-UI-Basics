package com.github.bijoysingh.uibasics.attributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
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
  private int iconMarginStyleable;
  private int iconMarginStartStyleable;
  private int iconMarginEndStyleable;
  private int iconMarginTopStyleable;
  private int iconMarginBottomStyleable;

  public ImageAttributes(Builder builder) {
    context = builder.context;
    attributeSet = builder.attributeSet;
    attrStyleable = builder.attrStyleable;
    srcStyleable = builder.srcStyleable;
    iconTintStyleable = builder.iconTintStyleable;
    iconPaddingStyleable = builder.iconPaddingStyleable;
    iconSizeStyleable = builder.iconSizeStyleable;
    iconMarginStyleable = builder.iconMarginStyleable;
    iconMarginStartStyleable = builder.iconMarginStartStyleable;
    iconMarginEndStyleable = builder.iconMarginEndStyleable;
    iconMarginTopStyleable = builder.iconMarginTopStyleable;
    iconMarginBottomStyleable = builder.iconMarginBottomStyleable;
  }

  public void set(ImageView view) {
    TypedArray typedArray = context.getTheme().obtainStyledAttributes(
        attributeSet,
        attrStyleable,
        0, 0);

    try {
      if (srcStyleable != -1) {
        // Set the image source
        int imageSrc = typedArray.getResourceId(srcStyleable, 0);
        if (imageSrc != 0) {
          view.setImageResource(imageSrc);
        } else {
          view.setVisibility(View.GONE);
        }
      }

      if (iconTintStyleable != -1) {
        // Set the image tint
        int tintColor = typedArray.getColor(iconTintStyleable, Color.GRAY);
        view.setColorFilter(tintColor);
      }

      if (iconPaddingStyleable != -1) {
        // Set the image padding
        int padding = (int) typedArray.getDimension(iconPaddingStyleable, 0);
        view.setPadding(padding, padding, padding, padding);
      }

      // Set the image margin
      int margin = iconMarginStyleable != -1
          ? (int) typedArray.getDimension(iconMarginStyleable, 0)
          : 0;
      int marginStart = iconMarginStartStyleable != -1
          ? (int) typedArray.getDimension(iconMarginStartStyleable, 0)
          : margin;
      int marginEnd = iconMarginEndStyleable != -1
          ? (int) typedArray.getDimension(iconMarginEndStyleable, 0)
          : margin;
      int marginTop = iconMarginTopStyleable != -1
          ? (int) typedArray.getDimension(iconMarginTopStyleable, 0)
          : margin;
      int marginBottom = iconMarginBottomStyleable != -1
          ? (int) typedArray.getDimension(iconMarginBottomStyleable, 0)
          : margin;
      ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
      params.setMargins(marginStart, marginTop, marginEnd, marginBottom);

      if (iconSizeStyleable != -1) {
        // Set the image size
        int size = (int) typedArray.getDimension(iconSizeStyleable,
                                                 context.getResources().getDimension(
                                                     R.dimen.default_icon));
        view.getLayoutParams().width = size;
        view.getLayoutParams().height = size;
      }

    } finally {
      typedArray.recycle();
    }
  }

  public static class Builder {
    private Context context;
    private AttributeSet attributeSet;
    private int[] attrStyleable;
    private int srcStyleable = -1;
    private int iconTintStyleable = -1;
    private int iconPaddingStyleable = -1;
    private int iconSizeStyleable = -1;
    private int iconMarginStyleable = -1;
    private int iconMarginStartStyleable = -1;
    private int iconMarginEndStyleable = -1;
    private int iconMarginTopStyleable = -1;
    private int iconMarginBottomStyleable = -1;

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

    public Builder setIconMarginStyleable(int iconMarginStyleable) {
      this.iconMarginStyleable = iconMarginStyleable;
      return this;
    }

    public Builder setIconMarginStartStyleable(int iconMarginStartStyleable) {
      this.iconMarginStartStyleable = iconMarginStartStyleable;
      return this;
    }

    public Builder setIconMarginEndStyleable(int iconMarginEndStyleable) {
      this.iconMarginEndStyleable = iconMarginEndStyleable;
      return this;
    }

    public Builder setIconMarginTopStyleable(int iconMarginTopStyleable) {
      this.iconMarginTopStyleable = iconMarginTopStyleable;
      return this;
    }

    public Builder setIconMarginBottomStyleable(int iconMarginBottomStyleable) {
      this.iconMarginBottomStyleable = iconMarginBottomStyleable;
      return this;
    }

    public ImageAttributes build() {
      return new ImageAttributes(this);
    }
  }
}
