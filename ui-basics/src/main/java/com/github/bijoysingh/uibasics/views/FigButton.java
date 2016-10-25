package com.github.bijoysingh.uibasics.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.bijoysingh.uibasics.R;
import com.github.bijoysingh.uibasics.base.CustomLinearLayout;

/**
 * The FigButton LinearLayout
 * Created by bijoy on 10/25/16.
 */

public class FigButton extends CustomLinearLayout {

  private ImageView mIcon;
  private TextView mLabel;

  public FigButton(Context context) {
    super(context);
  }

  public FigButton(Context context, AttributeSet attrs) {
    super(context, attrs);

    TypedArray typedArray = context.getTheme().obtainStyledAttributes(
        attrs,
        R.styleable.uibasics__FigButton,
        0, 0);

    try {
      // Sets the icon for the fig
      mIcon.setImageResource(typedArray.getResourceId(
          R.styleable.uibasics__FigButton_uibasics__src, 0));
      mIcon.setColorFilter(typedArray.getColor(
          R.styleable.uibasics__FigButton_uibasics__icon_tint, Color.WHITE));
      int padding = (int) typedArray.getDimension(
          R.styleable.uibasics__FigButton_uibasics__icon_padding,
          context.getResources().getDimension(R.dimen.uibasics__default_padding));
      mIcon.setPadding(padding, padding, padding, padding);

      // Sets the label for the fig
      mLabel.setText(typedArray.getText(R.styleable.uibasics__FigButton_uibasics__text));
      mLabel.setTextSize(typedArray.getDimension(
          R.styleable.uibasics__FigButton_uibasics__text_size,
          context.getResources().getDimension(R.dimen.uibasics__default_text_size)));
      mLabel.setTextColor(typedArray.getColor(
          R.styleable.uibasics__FigButton_uibasics__text_color,
          Color.WHITE));
    } finally {
      typedArray.recycle();
    }
  }

  public FigButton(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @TargetApi(21)
  public FigButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  public void init() {
    setContentLayout(R.layout.uibasics__fig_button);
    setOrientation(VERTICAL);

    mIcon = (ImageView) findViewById(R.id.uibasics__icon);
    mLabel = (TextView) findViewById(R.id.uibasics__label);
  }

  public ImageView getIconView() {
    return mIcon;
  }

  public TextView getLabelView() {
    return mLabel;
  }
}
