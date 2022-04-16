package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> ImgUrl= new ArrayList<>();
    RecyclerView recyclerView;
    LinearLayoutManager Manager;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {


       ImgUrl.add("https://i.pinimg.com/736x/e9/3a/96/e93a96c09e7b02691cc405a82ac448bc.jpg");
       ImgUrl.add("https://wallpaperaccess.com/full/790994.jpg");
       ImgUrl.add("https://www.imagesjunction.com/images/img/mobile_wallpaper.jpg");
       ImgUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgPLVt7GNvQJ3Cj9FsxzwCiU3Jfwt0Z8l3tA&usqp=CAU");
       ImgUrl.add("https://cdn.pixabay.com/photo/2022/02/23/08/23/mountains-7030260__340.jpg");
       ImgUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3rW4jHQI-CVZwiRizkjAKCf3T9OIP1ktFmA&usqp=CAU");
       ImgUrl.add("https://www.fonewalls.com/wp-content/uploads/2022/01/Trees-Reflection-Lake-4K-Phone-Wallpaper-300x533.jpg");
       ImgUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmI4O4HB0aZDNFQAkfgXzffPPk6kQzYVskRQ&usqp=CAU");
       ImgUrl.add("https://w0.peakpx.com/wallpaper/481/897/HD-wallpaper-android-12-dark-amoled.jpg");
       ImgUrl.add("http://wonderfulengineering.com/wp-content/uploads/2016/01/wallpaper-for-mobile-31.jpg");


        this.recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        Manager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(Manager);
        adapter = new MyAdapter(ImgUrl, this);
        recyclerView.setAdapter(adapter);

    }

}