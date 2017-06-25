package com.github.bijoysingh.uibasics.attributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
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
  private int textPaddingStyleable;
  private int textMarginStyleable;
  private int textMarginStartStyleable;
  private int textMarginEndStyleable;
  private int textMarginTopStyleable;
  private int textMarginBottomStyleable;
  private int textMaxLinesStyleable;
  private int textAllCapsStyleable;

  public TextAttributes(Builder builder) {
    context = builder.context;
    attributeSet = builder.attributeSet;
    attrStyleable = builder.attrStyleable;
    textStyleable = builder.textStyleable;
    textColorStyleable = builder.textColorStyleable;
    textSizeStyleable = builder.textSizeStyleable;
    textStyleStyleable = builder.textStyleStyleable;
    textPaddingStyleable = builder.textPaddingStyleable;
    textMarginStyleable = builder.textMarginStyleable;
    textMarginStartStyleable = builder.textMarginStartStyleable;
    textMarginEndStyleable = builder.textMarginEndStyleable;
    textMarginTopStyleable = builder.textMarginTopStyleable;
    textMarginBottomStyleable = builder.textMarginBottomStyleable;
    textMaxLinesStyleable = builder.textMaxLinesStyleable;
    textAllCapsStyleable = builder.textAllCapsStyleable;
  }

  public void set(TextView view) {
    TypedArray typedArray = context.getTheme().obtainStyledAttributes(
        attributeSet,
        attrStyleable,
        0, 0);

    try {
      if (textStyleable != -1) {
        // Sets the label for the fig
        view.setText(typedArray.getText(textStyleable));
      }

      if (textStyleStyleable != -1) {
        // Set the style of the text
        if (Build.VERSION.SDK_INT < 23) {
          view.setTextAppearance(context, typedArray.getResourceId(
              textStyleStyleable, 0));
        } else {
          view.setTextAppearance(typedArray.getResourceId(
              textStyleStyleable, 0));
        }
      }

      if (textSizeStyleable != -1) {
        // Set the text size of the image
        view.setTextSize(TypedValue.COMPLEX_UNIT_PX, typedArray.getDimension(
            textSizeStyleable,
            context.getResources().getDimension(R.dimen.default_text_size)));
      }

      if (textColorStyleable != -1) {
        // Set the text color
        view.setTextColor(typedArray.getColor(textColorStyleable, Color.BLACK));
      }

      if (textPaddingStyleable != -1) {
        // Set the text padding
        int padding = (int) typedArray.getDimension(textPaddingStyleable, 0);
        view.setPadding(padding, padding, padding, padding);
      }

      // Set the text margin
      int margin = textMarginStyleable != -1
          ? (int) typedArray.getDimension(textMarginStyleable, 0)
          : 0;
      int marginStart = textMarginStartStyleable != -1
          ? (int) typedArray.getDimension(textMarginStartStyleable, 0)
          : margin;
      int marginEnd = textMarginEndStyleable != -1
          ? (int) typedArray.getDimension(textMarginEndStyleable, 0)
          : margin;
      int marginTop = textMarginTopStyleable != -1
          ? (int) typedArray.getDimension(textMarginTopStyleable, 0)
          : margin;
      int marginBottom = textMarginBottomStyleable != -1
          ? (int) typedArray.getDimension(textMarginBottomStyleable, 0)
          : margin;
      ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
      params.setMargins(marginStart, marginTop, marginEnd, marginBottom);

      if (textMaxLinesStyleable != -1) {
        int count = typedArray.getInteger(textMaxLinesStyleable, -1);
        if (count >= 0) {
          view.setMaxLines(count);
        }
      }

      if (textAllCapsStyleable != -1) {
        boolean allCaps = typedArray.getBoolean(textAllCapsStyleable, false);
        view.setAllCaps(allCaps);
      }

    } finally {
      typedArray.recycle();
    }
  }

  public static class Builder {
    private Context context;
    private AttributeSet attributeSet;
    private int[] attrStyleable;
    private int textStyleable = -1;
    private int textSizeStyleable = -1;
    private int textColorStyleable = -1;
    private int textStyleStyleable = -1;
    private int textPaddingStyleable = -1;
    private int textMarginStyleable = -1;
    private int textMarginStartStyleable = -1;
    private int textMarginEndStyleable = -1;
    private int textMarginTopStyleable = -1;
    private int textMarginBottomStyleable = -1;
    private int textMaxLinesStyleable = -1;
    private int textAllCapsStyleable = -1;

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

    public Builder setTextPaddingStyleable(int textPaddingStyleable) {
      this.textPaddingStyleable = textPaddingStyleable;
      return this;
    }

    public Builder setTextMarginStyleable(int textMarginStyleable) {
      this.textMarginStyleable = textMarginStyleable;
      return this;
    }

    public Builder setTextMarginBottomStyleable(int textMarginBottomStyleable) {
      this.textMarginBottomStyleable = textMarginBottomStyleable;
      return this;
    }

    public Builder setTextMarginTopStyleable(int textMarginTopStyleable) {
      this.textMarginTopStyleable = textMarginTopStyleable;
      return this;
    }

    public Builder setTextMarginEndStyleable(int textMarginEndStyleable) {
      this.textMarginEndStyleable = textMarginEndStyleable;
      return this;
    }

    public Builder setTextMarginStartStyleable(int textMarginStartStyleable) {
      this.textMarginStartStyleable = textMarginStartStyleable;
      return this;
    }

    public Builder setTextMaxLinesStyleable(int textMaxLinesStyleable) {
      this.textMaxLinesStyleable = textMaxLinesStyleable;
      return this;
    }

    public Builder setTextAllCapsStyleable(int textAllCapsStyleable) {
      this.textAllCapsStyleable = textAllCapsStyleable;
      return this;
    }

    public TextAttributes build() {
      return new TextAttributes(this);
    }
  }
}
