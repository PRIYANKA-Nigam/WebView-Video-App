package com.example.webviewvideo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class YouTubeAdapter extends RecyclerView.Adapter<YouTube> {
    ArrayList<Dataset> arrayList;
    Context context;
    public YouTubeAdapter(ArrayList<Dataset> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public YouTube onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.video_row,parent,false);
        return new YouTube(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final YouTube holder, int position) {
final Dataset cur=arrayList.get(position);
holder.webView.loadUrl(cur.getLink());
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
