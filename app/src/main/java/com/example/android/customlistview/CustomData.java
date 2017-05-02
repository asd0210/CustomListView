package com.example.android.customlistview;

import android.graphics.Bitmap;

public class CustomData {
    private Bitmap imageData;
    private String textData1;
    private String textData2;

    public CustomData(Bitmap image, String s1, String s2) {
        super();
        imageData=image;
        textData1=s1;
        textData2=s2;
    }

    public void setImagaData(Bitmap image) {
        imageData = image;
    }

    public Bitmap getImageData() {
        return imageData;
    }

    public void setTextData1(String text) {
        textData1 = text;
    }

    public String getTextData1() {
        return textData1;
    }

    public void setTextData2(String text) {
        textData2 = text;
    }

    public String getTextData2() {
        return textData2;
    }
}
