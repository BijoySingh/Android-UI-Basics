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

public class UILabelView extends UITextViewBase {

  public UILabelView(Context context) {
    super(context);
  }

  public UILabelView(Context context, AttributeSet attrs) {
    super(context, attrs);

    new ImageAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.UITextViewBase)
        .setSrcStyleable(R.styleable.UITextViewBase_icon)
        .setIconSizeStyleable(R.styleable.UITextViewBase_iconSize)
        .setIconPaddingStyleable(R.styleable.UITextViewBase_iconPadding)
        .setIconTintStyleable(R.styleable.UITextViewBase_iconTint)
        .setIconMarginBottomStyleable(R.styleable.UITextViewBase_iconTextGap)
        .build()
        .set(mIcon);

    new TextAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.UITextViewBase)
        .setTextStyleable(R.styleable.UITextViewBase_text)
        .setTextColorStyleable(R.styleable.UITextViewBase_textColor)
        .setTextSizeStyleable(R.styleable.UITextViewBase_textSize)
        .setTextStyleStyleable(R.styleable.UITextViewBase_textStyle)
        .setTextPaddingStyleable(R.styleable.UITextViewBase_textPadding)
        .build()
        .set(mLabel);
  }

  public UILabelView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @TargetApi(21)
  public UILabelView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  public void init() {
    super.init();
    setOrientation(VERTICAL);
  }
}
