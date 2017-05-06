package com.example.android.singlescreenapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.width;

public class MainActivity extends AppCompatActivity {

    static ImageView comPic;
    static TextView comText;
    static ScrollView myScrollView;
    int myWidth, myHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myScrollView = (ScrollView)findViewById(R.id.myScrollView);
        comText = (TextView)findViewById(R.id.comText);
        comPic = (ImageView) findViewById(R.id.comPic);

        /*myWidth = this.getResources().getDisplayMetrics().widthPixels;
        myHeight = this.getResources().getDisplayMetrics().heightPixels;*/

        comPic.setOnTouchListener(new MyTouchListener(comPic));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            myHeight = this.getResources().getDisplayMetrics().heightPixels;
            myWidth = this.getResources().getDisplayMetrics().widthPixels;
            //comPic.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //comPic.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }
    }
}
