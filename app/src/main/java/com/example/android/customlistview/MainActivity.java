package com.example.android.customlistview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap image;
        image = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        // データの作成
        List<CustomData> objects = new ArrayList<CustomData>();

        /* これでもできるが不便
        CustomData item1 = new CustomData();
        item1.setImagaData(image);
        item1.setTextData1("タイトル");
        item1.setTextData2("内容");

        CustomData item2 = new CustomData();
        item2.setImagaData(image);
        item2.setTextData1("The second");
        item1.setTextData2("内容");

        CustomData item3 = new CustomData();
        item3.setImagaData(image);
        item3.setTextData1("Il terzo");
        item1.setTextData2("内容");

        objects.add(item1);
        objects.add(item2);
        objects.add(item3);

        CustomAdapter customAdapater = new CustomAdapter(this, 0, objects);
        */

        for(int i=0;i<10;i++){
            objects.add(new CustomData(image,"a"+i,"b"+i));
        }

        CustomAdapter customAdapater = new CustomAdapter(MainActivity.this,0, objects);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(customAdapater);
    }
}
