package com.example.task;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Linkdir extends AppCompatActivity {

    String url;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkdir);
//        getSupportActionBar().hide();
        imageView = findViewById(R.id.imgsho);
        Intent intent = getIntent();
        url = intent.getData().getQueryParameter("test_Redirect");
        Log.e(TAG,url.toString());
        Glide.with(Linkdir.this).load(url).into(imageView);
        Log.e(TAG,url.toString());
    }
}