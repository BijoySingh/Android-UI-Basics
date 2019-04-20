package com.github.bijoysingh.uibasics.setters;

import androidx.annotation.StringRes;

/**
 * Text Setter
 * Created by bijoy on 10/28/16.
 */

public interface TextSetter {
  void setText(@StringRes Integer stringResource);

  void setText(String text);

  void setTextColor(int color);

  void setTextSize(float size);

  void setTextPadding(int padding);

  void setTextAllCaps(boolean textAllCaps);

  void setTextMaxLines(int maxLines);
}
