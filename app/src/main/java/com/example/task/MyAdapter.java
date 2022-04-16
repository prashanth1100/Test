package com.example.task;

import static android.media.CamcorderProfile.get;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder> {
    ArrayList<String> urls;
    Context context;

    public MyAdapter(ArrayList<String> urls, Context context) {
        this.urls = urls;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        v.setLayoutParams(new RecyclerView.LayoutParams(1080,800));
        return new MyViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {


        Glide.with(this.context)
                .load(urls.get(position))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.getImage());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri pictureUri = Uri.parse(urls.get(holder.getAdapterPosition()));
                String text = "https://app.test/?test_Redirect="+pictureUri;
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"test");
                shareIntent.setType("text/plain");
                context.startActivity(Intent.createChooser(shareIntent, "Share images..."));
            }
        });
    }

    @Override
    public int getItemCount() {
        return urls.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder {
        ImageView image;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img);
        }

        public ImageView getImage()
        {
            return this.image;
        }
    }
}
