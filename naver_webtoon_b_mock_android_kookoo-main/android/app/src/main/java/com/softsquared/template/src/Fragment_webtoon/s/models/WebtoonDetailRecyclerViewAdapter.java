package com.softsquared.template.src.Fragment_webtoon.s.models;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_webtoon_contents.Fragment_webtoon_contents;

import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class WebtoonDetailRecyclerViewAdapter extends RecyclerView.Adapter<WebtoonDetailRecyclerViewAdapter .ViewHolder> {
    ArrayList<DetailResult_2>list;
    Context mContext;
    RequestManager mGlideRequestManager;

    public WebtoonDetailRecyclerViewAdapter(ArrayList<DetailResult_2> list, Context mContext, RequestManager mGlideRequestManager) {
        this.list = list;
        this.mContext = mContext;
        this.mGlideRequestManager = mGlideRequestManager;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView detail_thumbnail;
        public TextView detail_title, detail_star,detail_updatedDate;


        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            detail_thumbnail=itemView.findViewById(R.id.detail_thumbnail_item);
            detail_star=itemView.findViewById(R.id. detail_star_item);
            detail_title=itemView.findViewById(R.id. detail_title_item);
            detail_updatedDate=itemView.findViewById(R.id.detail_updatedDate_item);


            //터치할때 상세조회하도록 하자!
            //터치시 컨텐츠 내용볼수있도록하자!
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION){
                        int pickedItemIdx1 = 1;
                     String pickedItemIdx2 = list.get(pos).getEpisodeIdx();
                        Intent intent=new Intent(itemView.getContext(),Fragment_webtoon_contents.class);
                        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.putExtra("내가 고른 웹툰",pickedItemIdx1);
                        intent.putExtra("내가고른 에피소드",pickedItemIdx2);
                        v.getContext().startActivity(intent);
                        //

                    }
                }
            });
        }
    }
    @NonNull

    public WebtoonDetailRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.fragment_fragment_detail_item,parent,false);
        WebtoonDetailRecyclerViewAdapter.ViewHolder vh = new WebtoonDetailRecyclerViewAdapter.ViewHolder(view);

        return vh;
    }

    public void onBindViewHolder(@NonNull WebtoonDetailRecyclerViewAdapter.ViewHolder holder, int position) {
        String url = list.get(position).getThumbnailUrl();
        mGlideRequestManager.load(url)
                .centerCrop()
                .transition(withCrossFade())
                .into(holder.detail_thumbnail);


        holder.detail_title.setText(list.get(position).getTitle());
        holder.detail_star.setText(list.get(position).getStar());
        holder.detail_updatedDate.setText(list.get(position).getUpdatedDate());
    }


    public int getItemCount() {
        return list.size();
    }

}
