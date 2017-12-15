package com.github.bijoysingh.uibasics.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

import com.github.bijoysingh.uibasics.R;
import com.github.bijoysingh.uibasics.attributes.ImageAttributes;
import com.github.bijoysingh.uibasics.attributes.TextAttributes;
import com.github.bijoysingh.uibasics.base.UITextViewBase;

/**
 * The FigButton LinearLayout
 * Created by bijoy on 10/25/16.
 */

public class UITextView extends UITextViewBase {

  public UITextView(Context context) {
    super(context);
  }

  public UITextView(Context context, AttributeSet attrs) {
    super(context, attrs);

    new ImageAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.UITextViewBase)
        .setSrcStyleable(R.styleable.UITextViewBase_icon)
        .setIconSizeStyleable(R.styleable.UITextViewBase_iconSize)
        .setIconPaddingStyleable(R.styleable.UITextViewBase_iconPadding)
        .setIconTintStyleable(R.styleable.UITextViewBase_iconTint)
        .setIconMarginEndStyleable(R.styleable.UITextViewBase_iconTextGap)
        .build()
        .set(mIcon);

    new TextAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.UITextViewBase)
        .setTextStyleable(R.styleable.UITextViewBase_text)
        .setTextColorStyleable(R.styleable.UITextViewBase_textColor)
        .setTextSizeStyleable(R.styleable.UITextViewBase_textSize)
        .setTextWidthStyleable(R.styleable.UITextViewBase_textWidth)
        .setTextGravityStyleable(R.styleable.UITextViewBase_textGravity)
        .setTextLinesStyleable(R.styleable.UITextViewBase_textLines)
        .setTextStyleStyleable(R.styleable.UITextViewBase_textStyle)
        .setTextPaddingStyleable(R.styleable.UITextViewBase_textPadding)
        .setTextAllCapsStyleable(R.styleable.UITextViewBase_textAllCaps)
        .setTextMaxLinesStyleable(R.styleable.UITextViewBase_textMaxLines)
        .build()
        .set(mLabel);
  }

  public UITextView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @TargetApi(21)
  public UITextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  public void init() {
    super.init();
    setOrientation(HORIZONTAL);
  }
}
