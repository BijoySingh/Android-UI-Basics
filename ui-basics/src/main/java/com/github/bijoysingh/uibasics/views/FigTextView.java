package com.github.bijoysingh.uibasics.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.bijoysingh.uibasics.R;
import com.github.bijoysingh.uibasics.attributes.ImageAttributes;
import com.github.bijoysingh.uibasics.attributes.TextAttributes;
import com.github.bijoysingh.uibasics.base.CustomLinearLayout;

/**
 * The FigButton LinearLayout
 * Created by bijoy on 10/25/16.
 */

public class FigTextView extends CustomLinearLayout {

  private ImageView mIcon;
  private TextView mLabel;

  public FigTextView(Context context) {
    super(context);
  }

  public FigTextView(Context context, AttributeSet attrs) {
    super(context, attrs);

    new ImageAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.FigTextView)
        .setSrcStyleable(R.styleable.FigTextView_src)
        .setIconSizeStyleable(R.styleable.FigTextView_iconSize)
        .setIconPaddingStyleable(R.styleable.FigTextView_iconPadding)
        .setIconTintStyleable(R.styleable.FigTextView_iconTint)
        .setIconMarginEndStyleable(R.styleable.FigTextView_iconTextGap)
        .build()
        .set(mIcon);

    new TextAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.FigTextView)
        .setTextStyleable(R.styleable.FigTextView_text)
        .setTextColorStyleable(R.styleable.FigTextView_textColor)
        .setTextSizeStyleable(R.styleable.FigTextView_textSize)
        .setTextStyleStyleable(R.styleable.FigTextView_textStyle)
        .build()
        .set(mLabel);
  }

  public FigTextView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @TargetApi(21)
  public FigTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  public void init() {
    setContentLayout(R.layout.fig_button);
    setOrientation(HORIZONTAL);

    mIcon = (ImageView) findViewById(R.id.icon);
    mLabel = (TextView) findViewById(R.id.label);
  }

  public void setIcon(Drawable drawable) {
    mIcon.setImageDrawable(drawable);
  }

  public void setIconResource(@DrawableRes Integer drawableRes) {
    mIcon.setImageResource(drawableRes);
  }

  public void setIconTint(@ColorRes Integer colorRes) {
    mIcon.setColorFilter(ContextCompat.getColor(getContext(), colorRes));
  }

  public void setIconPadding(@DimenRes Integer dimenRes) {
    int padding = (int) getContext().getResources().getDimension(dimenRes);
    mIcon.setPadding(padding, padding, padding, padding);
  }

  public void setLabel(String label) {
    mLabel.setText(label);
  }

  public void setLabel(@StringRes Integer labelRes) {
    mLabel.setText(labelRes);
  }

  public void setLabelColor(@ColorRes Integer textColorRes) {
    mLabel.setTextColor(ContextCompat.getColor(getContext(), textColorRes));
  }

  public void setLabelSize(@DimenRes Integer dimenRes) {
    int labelSize = (int) getContext().getResources().getDimension(dimenRes);
    mLabel.setTextSize(labelSize);
  }
}
