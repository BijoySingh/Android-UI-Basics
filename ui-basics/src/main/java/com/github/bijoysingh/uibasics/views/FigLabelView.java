package com.github.bijoysingh.uibasics.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

import com.github.bijoysingh.uibasics.R;
import com.github.bijoysingh.uibasics.attributes.ImageAttributes;
import com.github.bijoysingh.uibasics.attributes.TextAttributes;
import com.github.bijoysingh.uibasics.base.FigTextViewBase;

/**
 * The FigButton LinearLayout
 * Created by bijoy on 10/25/16.
 */

public class FigLabelView extends FigTextViewBase {

  public FigLabelView(Context context) {
    super(context);
  }

  public FigLabelView(Context context, AttributeSet attrs) {
    super(context, attrs);

    new ImageAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.FigTextViewBase)
        .setSrcStyleable(R.styleable.FigTextViewBase_src)
        .setIconSizeStyleable(R.styleable.FigTextViewBase_iconSize)
        .setIconPaddingStyleable(R.styleable.FigTextViewBase_iconPadding)
        .setIconTintStyleable(R.styleable.FigTextViewBase_iconTint)
        .setIconMarginBottomStyleable(R.styleable.FigTextViewBase_iconTextGap)
        .build()
        .set(mIcon);

    new TextAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.FigTextViewBase)
        .setTextStyleable(R.styleable.FigTextViewBase_text)
        .setTextColorStyleable(R.styleable.FigTextViewBase_textColor)
        .setTextSizeStyleable(R.styleable.FigTextViewBase_textSize)
        .setTextStyleStyleable(R.styleable.FigTextViewBase_textStyle)
        .setTextPaddingStyleable(R.styleable.FigTextViewBase_textPadding)
        .build()
        .set(mLabel);
  }

  public FigLabelView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @TargetApi(21)
  public FigLabelView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  public void init() {
    super.init();
    setOrientation(VERTICAL);
  }
}
