package com.github.bijoysingh.uibasics.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
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

public class FigContentView extends CustomLinearLayout
    implements TitleSubtitleSetter, ImageSetter {

  private ImageView mIcon;
  private TextView mTitle;
  private TextView mSubtitle;

  public FigContentView(Context context) {
    super(context);
  }

  public FigContentView(Context context, AttributeSet attrs) {
    super(context, attrs);

    new ImageAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.FigTextViewBase)
        .setSrcStyleable(R.styleable.FigTextViewBase_icon)
        .setIconSizeStyleable(R.styleable.FigTextViewBase_iconSize)
        .setIconPaddingStyleable(R.styleable.FigTextViewBase_iconPadding)
        .setIconTintStyleable(R.styleable.FigTextViewBase_iconTint)
        .setIconMarginEndStyleable(R.styleable.FigTextViewBase_iconTextGap)
        .build()
        .set(mIcon);

    new TextAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.FigContentView)
        .setTextStyleable(R.styleable.FigContentView_title)
        .setTextColorStyleable(R.styleable.FigContentView_titleColor)
        .setTextSizeStyleable(R.styleable.FigContentView_titleSize)
        .setTextStyleStyleable(R.styleable.FigContentView_titleStyle)
        .setTextPaddingStyleable(R.styleable.FigContentView_titlePadding)
        .build()
        .set(mTitle);

    new TextAttributes.Builder()
        .setContext(context)
        .setAttributeSet(attrs)
        .setAttrStyleable(R.styleable.FigContentView)
        .setTextStyleable(R.styleable.FigContentView_subtitle)
        .setTextColorStyleable(R.styleable.FigContentView_subtitleColor)
        .setTextSizeStyleable(R.styleable.FigContentView_subtitleSize)
        .setTextStyleStyleable(R.styleable.FigContentView_subtitleStyle)
        .setTextPaddingStyleable(R.styleable.FigContentView_subtitlePadding)
        .build()
        .set(mSubtitle);
  }

  public FigContentView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public FigContentView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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
  }

  @Override
  public void setImageDrawable(Drawable imageDrawable) {
    mIcon.setImageDrawable(imageDrawable);
  }

  @Override
  public void setImageBitmap(Bitmap bitmap) {
    mIcon.setImageBitmap(bitmap);
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

}
