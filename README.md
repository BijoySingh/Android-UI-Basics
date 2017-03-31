# Android-UI-Basics
Android library which contains basic UI views to help with development. This library contains various common views for usage in Android Apps.
This library also contains a set of colors which are useful in design.

## Installation (Usage)
```gradle

compile 'com.github.bijoysingh:ui-basics:0.0.13'

```

## Colors
Color resources from the following sources
- https://designschool.canva.com/blog/100-color-combinations/
- https://material.google.com/style/color.html/

## Views
### FigTextView
`ImageView` on the left of the `TextView`, with a lot more control than using `drawableLeft/Start`.

![FigTextView](readme/FigTextView.png)
```xml
<com.github.bijoysingh.uibasics.views.FigTextView
   android:layout_width="match_parent"
   android:layout_height="wrap_content"
   android:background="#f1f1f1"
   android:gravity="center_vertical"
   android:padding="16dp"
   ui:iconPadding="@dimen/fig_textview_icon_padding"
   ui:iconSize="48dp"
   ui:iconTextGap="@dimen/fig_textview_icon_text_gap"
   ui:iconTint="@color/dark_hint_text"
   ui:icon="@drawable/ic_android_white_48dp"
   ui:text="@string/big_text_placeholder"
   ui:textColor="@color/dark_tertiary_text"
   ui:textSize="16sp"
   ui:textStyle="@style/CustomFigTextView"
   />
```

### FigLabelView
`ImageView` on below the `TextView`, lot cleaner than putting LinearLayouts for this.

![FigTextView](readme/FigLabelView.png)
```xml
<com.github.bijoysingh.uibasics.views.UILabelView
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:gravity="center"
   android:padding="16dp"
   android:background="#f1f1f1"
   ui:iconPadding="@dimen/fig_labelview_icon_padding"
   ui:iconSize="48dp"
   ui:iconTextGap="@dimen/fig_labelview_icon_text_gap"
   ui:iconTint="@color/canva_1_stem"
   ui:icon="@drawable/ic_android_white_48dp"
   ui:text="@string/tiny_text_placeholder"
   ui:textColor="@color/dark_primary_text"
   ui:textSize="18sp"
   ui:textStyle="@style/CustomFigLabelView"
   />
```

### FigContentView
`ImageView` next to a title `TextView` and a subtitle `TextView`.

![FigTextView](readme/FigContentView.png)
```xml
<com.github.bijoysingh.uibasics.views.UIContentView
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:background="#f1f1f1"
   android:gravity="center_vertical"
   android:padding="16dp"
   ui:icon="@drawable/ic_android_white_48dp"
   ui:iconSize="36dp"
   ui:iconTextGap="16dp"
   ui:iconTint="@color/canva_1_stem"
   ui:title="@string/text_placeholder"
   ui:titleSize="16sp"
   ui:titleColor="@color/dark_secondary_text"
   ui:titleStyle="@style/CustomFigContentViewTitle"
   ui:subtitle="@string/big_text_placeholder"
   ui:subtitleSize="14sp"
   ui:subtitleColor="@color/dark_tertiary_text"
   ui:subtitleStyle="@style/CustomFigContentViewSubtitle"
   />
```

### FigContentView
`ImageView` next to a title `TextView` and a subtitle `TextView` and an action Button.

![FigActionView](readme/FigActionView.png)
```xml
<com.github.bijoysingh.uibasics.views.UIActionView
   android:layout_width="match_parent"
   android:layout_height="wrap_content"
   android:background="#f1f1f1"
   android:gravity="center_vertical"
   android:padding="16dp"
   ui:icon="@drawable/ic_android_white_48dp"
   ui:iconSize="36dp"
   ui:iconTextGap="16dp"
   ui:iconTint="@color/canva_1_stem"
   ui:title="@string/text_placeholder"
   ui:titleSize="16sp"
   ui:titleColor="@color/dark_secondary_text"
   ui:titleStyle="@style/CustomFigContentViewTitle"
   ui:subtitle="@string/big_text_placeholder"
   ui:subtitleSize="14sp"
   ui:subtitleColor="@color/dark_tertiary_text"
   ui:subtitleStyle="@style/CustomFigContentViewSubtitle"
   ui:action="@drawable/ic_keyboard_arrow_right_white_24dp"
   ui:actionSize="36dp"
   ui:actionTextGap="16dp"
   ui:actionTint="@color/dark_hint_text"
   />
```