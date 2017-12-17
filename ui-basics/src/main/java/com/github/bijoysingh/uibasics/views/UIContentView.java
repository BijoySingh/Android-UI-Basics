package com.github.bijoysingh.uibasics.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.bijoysingh.uibasics.R;
import com.github.bijoysingh.uibasics.attributes.ImageAttributes;
import com.github.bijoysingh.uibasics.attributes.TextAttributes;
import com.github.bijoysingh.uibasics.base.CustomLinearLayout;
import com.github.bijoysingh.uibasics.setters.ImageSetter;
import com.github.bijoysingh.uibasics.setters.TitleSubtitleSetter;

/**
 * Fig Content View
 * Created by bijoy on 10/28/16.
 */

public class UIContentView extends CustomLinearLayout
    implements TitleSubtitleSetter, ImageSetter {

  private ImageView mIcon;
  private TextView mTitle;
  private TextView mSubtitle;

  public UIContentView(Context context) {
    super(context);
  }

  public UIContentView(Context context, AttributeSet attrs) {
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
        .setAttrStyleable(R.styleable.UIContentView)
        .setTextStyleable(R.styleable.UIContentView_title)
        .setTextColorStyleable(R.styleable.UIContentView_titleColor)
        .setTextSizeStyleable(R.styleable.UIContentView_titleSize)
        .setTextStyleStyleable(R.styleable.UIContentView_titleStyle)
        .setTextPaddingStyleable(R.styleable.UIContentView_titlePadding)
        .setTextAllCapsStyleable(R.styleable.UIContentView_titleAllCaps)
        .setTextMaxLinesStyleable(R.styleable.UIContentView_titleMaxLines)
        .build()
        .set(mTitle);

    new TextAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.UIContentView)
        .setTextStyleable(R.styleable.UIContentView_subtitle)
        .setTextColorStyleable(R.styleable.UIContentView_subtitleColor)
        .setTextSizeStyleable(R.styleable.UIContentView_subtitleSize)
        .setTextStyleStyleable(R.styleable.UIContentView_subtitleStyle)
        .setTextPaddingStyleable(R.styleable.UIContentView_subtitlePadding)
        .setTextAllCapsStyleable(R.styleable.UIContentView_subtitleAllCaps)
        .setTextMaxLinesStyleable(R.styleable.UIContentView_subtitleMaxLines)
        .build()
        .set(mSubtitle);
  }

  public UIContentView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public UIContentView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  protected void init() {
    setContentLayout(R.layout.fig_content);
    setOrientation(HORIZONTAL);

    mIcon = (ImageView) findViewById(R.id.icon);
    mTitle = (TextView) findViewById(R.id.title);
    mSubtitle = (TextView) findViewById(R.id.subtitle);
  }

  @Override
  public void setTitle(@StringRes Integer stringResource) {
    mTitle.setText(stringResource);
  }

  @Override
  public void setTitle(String text) {
    mTitle.setText(text);
  }

  @Override
  public void setTitleColor(int color) {
    mTitle.setTextColor(color);
  }

  @Override
  public void setTitleSize(float size) {
    mTitle.setTextSize(size);
  }

  @Override
  public void setTitlePadding(int padding) {
    mTitle.setPadding(padding, padding, padding, padding);
  }

  @Override
  public void setSubtitle(@StringRes Integer stringResource) {
    mSubtitle.setText(stringResource);
  }

  @Override
  public void setSubtitle(String text) {
    mSubtitle.setText(text);
  }

  @Override
  public void setSubtitleColor(int color) {
    mSubtitle.setTextColor(color);
  }

  @Override
  public void setSubtitleSize(float size) {
    mSubtitle.setTextSize(size);
  }

  @Override
  public void setSubtitlePadding(int padding) {
    mSubtitle.setPadding(padding, padding, padding, padding);
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

  public ImageView getIcon() {
    return mIcon;
  }

  public TextView getTitle() {
    return mTitle;
  }

  public TextView getSubtitle() {
    return mSubtitle;
  }

}
