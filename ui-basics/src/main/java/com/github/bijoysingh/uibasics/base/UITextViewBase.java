package com.github.bijoysingh.uibasics.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.bijoysingh.uibasics.R;
import com.github.bijoysingh.uibasics.setters.ImageSetter;
import com.github.bijoysingh.uibasics.setters.TextSetter;

/**
 * Fig Text View Base
 * Created by bijoy on 10/28/16.
 */

public abstract class UITextViewBase extends CustomLinearLayout
    implements ImageSetter, TextSetter {

  protected ImageView mIcon;
  protected TextView mLabel;

  public UITextViewBase(Context context) {
    super(context);
  }

  public UITextViewBase(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public UITextViewBase(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public UITextViewBase(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  public void init() {
    setContentLayout(R.layout.fig_textview);
    mIcon = (ImageView) findViewById(R.id.icon);
    mLabel = (TextView) findViewById(R.id.label);
  }


  @Override
  public void setImageResource(@DrawableRes Integer imageResource) {
    mIcon.setImageResource(imageResource);
    mIcon.setVisibility(View.VISIBLE);
  }

  @Override
  public void setImageDrawable(Drawable imageDrawable) {
    mIcon.setImageDrawable(imageDrawable);
    mIcon.setVisibility(View.VISIBLE);
  }

  @Override
  public void setImageBitmap(Bitmap bitmap) {
    mIcon.setImageBitmap(bitmap);
    mIcon.setVisibility(View.VISIBLE);
  }

  @Override
  public void setImagePadding(int padding) {
    mIcon.setPadding(padding, padding, padding, padding);
  }

  @Override
  public void setImageTint(int color) {
    mIcon.setColorFilter(color);
  }

  @Override
  public void setImageSize(int size) {
    mIcon.getLayoutParams().height = size;
    mIcon.getLayoutParams().width = size;
    requestLayout();
  }

  @Override
  public void setText(@StringRes Integer stringResource) {
    mLabel.setText(stringResource);
  }

  @Override
  public void setText(String text) {
    mLabel.setText(text);
  }

  @Override
  public void setTextColor(int color) {
    mLabel.setTextColor(color);
  }

  @Override
  public void setTextSize(float size) {
    mLabel.setTextSize(size);
  }

  @Override
  public void setTextPadding(int padding) {
    mLabel.setPadding(padding, padding, padding, padding);
  }

  @Override
  public void setTextAllCaps(boolean textAllCaps) {
    mLabel.setAllCaps(textAllCaps);
  }

  @Override
  public void setTextMaxLines(int maxLines) {
    mLabel.setMaxLines(maxLines);
  }

  public ImageView getIcon() {
    return mIcon;
  }

  public TextView getLabel() {
    return mLabel;
  }
}
