package com.example.hdwallapers;

import android.widget.ImageView;

public class category_model {
    private int  ImageView;
    private String titles;

    public category_model(int imageView, String titles) {
        ImageView = imageView;
        this.titles = titles;
    }

    public int getImageView() {
        return ImageView;
    }

    public String getTitles() {
        return titles;
    }
}

