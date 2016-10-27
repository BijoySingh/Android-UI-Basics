package com.github.bijoysingh.uibasics.attributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import com.github.bijoysingh.uibasics.R;

/**
 * Text Attributes handling
 * Created by bijoy on 10/27/16.
 */

public class TextAttributes {
  private Context context;
  private AttributeSet attributeSet;
  private int[] attrStyleable;
  private int textStyleable;
  private int textSizeStyleable;
  private int textColorStyleable;
  private int textStyleStyleable;

  public TextAttributes(Builder builder) {
    context = builder.context;
    attributeSet = builder.attributeSet;
    attrStyleable = builder.attrStyleable;
    textStyleable = builder.textStyleable;
    textColorStyleable = builder.textColorStyleable;
    textSizeStyleable = builder.textSizeStyleable;
    textStyleStyleable = builder.textStyleStyleable;
  }

  public void set(TextView view) {
    TypedArray typedArray = context.getTheme().obtainStyledAttributes(
        attributeSet,
        attrStyleable,
        0, 0);

    try {
      // Sets the label for the fig
      view.setText(typedArray.getText(textStyleable));
      view.setTextSize(TypedValue.COMPLEX_UNIT_PX, typedArray.getDimension(
          textSizeStyleable,
          context.getResources().getDimension(R.dimen.default_text_size)));
      view.setTextColor(typedArray.getColor(
          textColorStyleable,
          Color.WHITE));

      // Set the style of the text
      if (Build.VERSION.SDK_INT < 23) {
        view.setTextAppearance(context, typedArray.getResourceId(
            textStyleStyleable, 0));
      } else {
        view.setTextAppearance(typedArray.getResourceId(
            textStyleStyleable, 0));
      }
    } finally {
      typedArray.recycle();
    }
  }

  public static class Builder {
    private Context context;
    private AttributeSet attributeSet;
    private int[] attrStyleable;
    private int textStyleable;
    private int textSizeStyleable;
    private int textColorStyleable;
    private int textStyleStyleable;

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

    public Builder setTextStyleable(int textStyleable) {
      this.textStyleable = textStyleable;
      return this;
    }

    public Builder setTextSizeStyleable(int textSizeStyleable) {
      this.textSizeStyleable = textSizeStyleable;
      return this;
    }

    public Builder setTextColorStyleable(int textColorStyleable) {
      this.textColorStyleable = textColorStyleable;
      return this;
    }

    public Builder setTextStyleStyleable(int textStyleStyleable) {
      this.textStyleStyleable = textStyleStyleable;
      return this;
    }

    public TextAttributes build() {
      return new TextAttributes(this);
    }
  }
}
