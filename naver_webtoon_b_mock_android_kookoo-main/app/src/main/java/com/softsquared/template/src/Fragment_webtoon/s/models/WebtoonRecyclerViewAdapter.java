package com.softsquared.template.src.Fragment_webtoon.s.models;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.softsquared.template.R;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class WebtoonRecyclerViewAdapter extends RecyclerView.Adapter<WebtoonRecyclerViewAdapter.ItemHolder> {


    Context mContext;
    LayoutInflater mInflater;
    ArrayList<Result> list;




    public WebtoonRecyclerViewAdapter(ArrayList<Result>list,Context context) {
        this.mContext = context;
        this.list=list;
        this.mInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public WebtoonRecyclerViewAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =mInflater.inflate(R.layout.webtoondisplay_item_layout,parent,false);
        return new ItemHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull WebtoonRecyclerViewAdapter.ItemHolder holder, int position) {
        String url = list.get(position).getThumbnailUrl();
        Log.d("haha","왜 안돼");
        holder.webtoon_title.setText(list.get(position).getTitle());
        holder.webtoon_star.setText(Integer.toString((int)list.get(position).getStar()));
        holder. webtoon_writer.setText(list.get(position).getCreator());

        Glide.with(mContext)
                .load(url)
                .centerCrop()
                .transition(withCrossFade())
                .into(holder.webtoon_thumnail);


    }

    @Override
    public int getItemCount() {
       return list.size();
    }
    public class ItemHolder extends RecyclerView.ViewHolder{

        ImageView webtoon_thumnail,search;
        TextView webtoon_title,webtoon_star, webtoon_writer;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            webtoon_thumnail=itemView.findViewById(R.id.webtoon_thumnail);
            webtoon_title=itemView.findViewById(R.id.webtoon_title);
            webtoon_star=itemView.findViewById(R.id.webtoon_star);
            webtoon_writer=itemView.findViewById(R.id.webtoon_writer);
            search = itemView.findViewById(R.id.bt_search);

            search.setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        }




        void onBind(Result result) {





        }
    }
}
