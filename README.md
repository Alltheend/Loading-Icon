# Loading-Icon
Just add LoadingIcon.java to your project and customize your loading icon as you like. Add it like any other View:

```
    LoadingIcon icon;
    RelativeLayout layout;
    layout = (RelativeLayout) findViewById(R.id.layout);
    params = new RelativeLayout.LayoutParams(500, 500);
    icon = new LoadingIcon(this);
    icon.setLayoutParams(params);
    layout.addView(icon);
```
Default icon:
<img src="https://media.giphy.com/media/xTiTngbSVlVQv1cZjy/giphy.gif" width="270" style="margin-right:10px;">

Methods:
```
setIconDuration(long duration);
setIconColor(String[] color);
setIconInverted(boolean inverted);
setIconBgColor(String color);
setIconStroke(int stroke);
setIconLines(int lineCount);
setIconSpacing(int spacing);
setIconInterpolator(BaseInterpolator interpolator);
```


Customized example:
```
        icon.setIconColor(new String[]{
                "#DA0124" , "#000000"});
        icon.setIconBgColor("#ffffff");
        icon.setIconSpacing(9);
        icon.setIconLines(4);
        icon.setIconInterpolator(new OvershootInterpolator());
```
<img src="https://media.giphy.com/media/3oEdv6LV1chEe7oTjq/giphy.gif" width="270" style="margin-right:10px;">
