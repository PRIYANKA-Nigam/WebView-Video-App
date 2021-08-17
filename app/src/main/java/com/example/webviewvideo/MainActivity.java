package com.example.webviewvideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<Dataset> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.re);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        arrayList=new ArrayList<Dataset>();
        Dataset dataset=new Dataset(" https://www.youtube.com/watch?v=6OVB9KtBzmM");
        arrayList.add(dataset);
        dataset=new Dataset(" https://www.youtube.com/watch?v=spMkaJp975s&pbjreload=101");
        arrayList.add(dataset);
        dataset=new Dataset(" https://www.youtube.com/watch?v=TvRhfaouBHs");
        arrayList.add(dataset);
        dataset=new Dataset(" https://www.youtube.com/watch?v=A6PWu3EH7Xw");
        arrayList.add(dataset);
        YouTubeAdapter youTubeAdapter=new YouTubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youTubeAdapter);
    }
}