package com.softsquared.template.src.Fragment_recommended_complete.models;

import android.annotation.SuppressLint;
import android.content.Context;
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
import com.softsquared.template.src.Fragment_webtoon.s.models.Result;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonRecyclerViewAdapter;

import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class Webtoon_RecommendedRecyclerViewAdapter extends RecyclerView.Adapter<Webtoon_RecommendedRecyclerViewAdapter.ItemHolder> {
    Context mContext;
    LayoutInflater mInflater;
    ArrayList<WebtoonList> list;


    public Webtoon_RecommendedRecyclerViewAdapter(ArrayList<WebtoonList>list, Context context) {
        this.mContext = context;
        this.list=list;
        this.mInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Webtoon_RecommendedRecyclerViewAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =mInflater.inflate(R.layout.webtoonrecommended_item_layout,parent,false);
        return new Webtoon_RecommendedRecyclerViewAdapter.ItemHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull Webtoon_RecommendedRecyclerViewAdapter.ItemHolder holder, int position) {
        String url = list.get(position).getThumbnailUrl();
        holder.webtoon_title.setText(list.get(position).getTitle());
        holder.webtoon_description.setText(list.get(position).getSummary());
        holder.webtoon_count.setText(list.get(position).getTotalEpisode());
        holder.webtoon_creator.setText(list.get(position).getCreator());



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
    public class ItemHolder extends RecyclerView.ViewHolder {

        ImageView webtoon_thumnail;
        TextView webtoon_title, webtoon_creator, webtoon_description, webtoon_count;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            webtoon_thumnail = itemView.findViewById(R.id.webtoon_recommended_thumbnail);
            webtoon_title = itemView.findViewById(R.id.webtoon_recommended_title);
            webtoon_creator = itemView.findViewById(R.id.webtoon_recommended_creator);
            webtoon_description = itemView.findViewById(R.id.webtoon_recommended_description);
            webtoon_count = itemView.findViewById(R.id.webtoon_recommended_count);


        }


    }
    }
