package com.karolisjc.loadingicon;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView();
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        layout = (RelativeLayout) findViewById(R.id.layout);
        params = new RelativeLayout.LayoutParams(500, 500);
        icon = new LoadingIcon(this);
        icon.setLayoutParams(params);
        layout.addView(icon);


    }
    LoadingIcon icon;
    RelativeLayout layout;
    RelativeLayout.LayoutParams params;

    public void setView(){

        layout.removeView(icon);
        icon = new LoadingIcon(this);
        icon.setIconColor(new String[]{
                "#DA0124" , "#000000"});
        icon.setIconBgColor("#ffffff");
        icon.setIconSpacing(9);
        icon.setIconLines(4);
        icon.setIconInterpolator(new OvershootInterpolator());
        icon.setLayoutParams(params);
        layout.addView(icon);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
