package com.example.danilamaster;

import androidx.annotation.NonNull;

public class GingerTool {

    private String title;
    private String info;
    private int ImgResId;

    public GingerTool(String title, String info, int imgResId) {
        this.title = title;
        this.info = info;
        ImgResId = imgResId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImgResId() {
        return ImgResId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
