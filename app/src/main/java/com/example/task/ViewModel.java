package com.example.task;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

import java.util.List;

public class ViewModel extends Linkdir {

    private List<MyModel> mModel;
    private Context mContext;

    public ViewModel(List<MyModel> mModel, Context mContext) {
        this.mModel = mModel;
        this.mContext = mContext;
    }

    @BindingAdapter({"image"})
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).centerCrop().into(view);

    }

    public View.OnClickListener onCommentsClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "images Share", Toast.LENGTH_SHORT).show();
            }
        };
    }
}
