package com.example.task;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Linkdir extends AppCompatActivity {

    String url;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_linkdir);
        imageView = findViewById(R.id.imgsho);
        Intent intent = getIntent();
        url = intent.getData().getQueryParameter("test_Redirect");
        Log.e(TAG,url.toString());
        Glide.with(Linkdir.this).load(url).into(imageView);
        Log.e(TAG,url.toString());

        Click();
    }

    private void Click() {

        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH ){
            imageView.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION );
        }
        else if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
            imageView.setSystemUiVisibility( View.STATUS_BAR_HIDDEN );
        else{}

    }


}