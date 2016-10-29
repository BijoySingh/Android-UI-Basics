package com.github.bijoysingh.uibasics.setters;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.view.View;

/**
 * ImageSetter
 * Created by bijoy on 10/28/16.
 */

public interface ActionSetter {

  void setActionResource(@DrawableRes Integer imageResource);

  void setActionDrawable(Drawable imageDrawable);

  void setActionBitmap(Bitmap bitmap);

  void setActionPadding(int padding);

  void setActionTint(int color);

  void setActionSize(int size);

  void setActionClickListener(View.OnClickListener listener);
}
