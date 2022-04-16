package com.example.task;

public class MyModel {

    String imagelist;

    public MyModel(Integer[] imagelist) {
    }

    public MyModel(String imagelist) {
        this.imagelist = imagelist;
    }

    public String getImagelist() {
        return imagelist;
    }

    public void setImagelist(String imagelist) {
        this.imagelist = imagelist;
    }
}
