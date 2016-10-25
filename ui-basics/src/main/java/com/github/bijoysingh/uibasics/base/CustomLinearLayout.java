package com.github.bijoysingh.uibasics.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Custom Linear Layout for the merging
 * Created by bijoy on 10/25/16.
 */

public abstract class CustomLinearLayout extends LinearLayout {
  public CustomLinearLayout(Context context) {
    super(context);
    init();
  }

  public CustomLinearLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public CustomLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  @TargetApi(21)
  public CustomLinearLayout(Context context, AttributeSet attrs, int defStyleAttr,
                            int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    init();
  }

  protected abstract void init();

  protected void setContentLayout(Integer layout) {
    inflate(getContext(), layout, this);
  }

}
