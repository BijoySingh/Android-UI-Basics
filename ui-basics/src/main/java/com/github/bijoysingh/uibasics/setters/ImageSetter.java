package com.github.bijoysingh.uibasics.setters;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;

/**
 * ImageSetter
 * Created by bijoy on 10/28/16.
 */

public interface ImageSetter {

  void setImageResource(@DrawableRes Integer imageResource);

  void setImageDrawable(Drawable imageDrawable);

  void setImageBitmap(Bitmap bitmap);

  void setImagePadding(int padding);

  void setImageTint(int color);

  void setImageSize(int size);
}
