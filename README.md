# Loading-Icon
Just add LoadingIcon.java to your project and customize your loading icon as you like. Add it like any other View:

```
    LoadingIcon icon;
    RelativeLayout layout;
    layout = (RelativeLayout) findViewById(R.id.layout);
    params = new RelativeLayout.LayoutParams(500, 500);
    icon = new LoadingIcon(this, params.width, params.height);
    icon.setLayoutParams(params);
    layout.addView(icon);
```

<img src="https://media.giphy.com/media/xTiTngbSVlVQv1cZjy/giphy.gif" width="270" style="margin-right:10px;">
<img src="https://media.giphy.com/media/3oEdv6LV1chEe7oTjq/giphy.gif" width="270" style="margin-right:10px;">
