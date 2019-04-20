package com.github.bijoysingh.uibasics.setters;

import androidx.annotation.StringRes;

/**
 * Text Setter
 * Created by bijoy on 10/28/16.
 */

public interface TitleSubtitleSetter {
  void setTitle(@StringRes Integer stringResource);

  void setTitle(String text);

  void setTitleColor(int color);

  void setTitleSize(float size);

  void setTitlePadding(int padding);

  void setSubtitle(@StringRes Integer stringResource);

  void setSubtitle(String text);

  void setSubtitleColor(int color);

  void setSubtitleSize(float size);

  void setSubtitlePadding(int padding);
}
