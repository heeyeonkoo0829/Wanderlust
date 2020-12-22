package com.softsquared.template.src.Fragment_webtoon_contents;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_webtoon_contents.models.Contents_ContentsUrl;

import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class Contents_RecyclerViewAdapter extends RecyclerView.Adapter<Contents_RecyclerViewAdapter.MyViewHolder> {

Context mContext;
LayoutInflater mInflater;
ArrayList<Contents_ContentsUrl> list;


public Contents_RecyclerViewAdapter(ArrayList<Contents_ContentsUrl>list,Context context){
    this.mContext=context;
    this.list=list;
    this.mInflater=LayoutInflater.from(context);
}


    @NonNull
    @Override
    public Contents_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=mInflater.inflate(R.layout.fragment_webtoon_contents_item,parent,false);
        //       fragment안에서는 주석처리한 부분과 같이..
        //       Context context = parent.getContext();
        //        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //        View view = inflater.inflate(R.layout.fragment_fragment_detail_item,parent,false);
        //        WebtoonDetailRecyclerViewAdapter.ViewHolder vh = new WebtoonDetailRecyclerViewAdapter.ViewHolder(view);
        //
        //        return vh;
        return new Contents_RecyclerViewAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Contents_RecyclerViewAdapter.MyViewHolder holder, int position) {
     String url=list.get(position).getContentsUrl();
     Glide.with(mContext)
             .load(url)
             .centerCrop()
             .transition(withCrossFade())
             .into(holder.contents_image);
        //  String url = list.get(position).getThumbnailUrl();
        //        mGlideRequestManager.load(url)
        //                .centerCrop()
        //                .transition(withCrossFade())
        //                .into(holder.detail_thumbnail);
        //
        //
        //        holder.detail_title.setText(list.get(position).getTitle());
        //        holder.detail_star.setText(list.get(position).getStar());
        //        holder.detail_updatedDate.setText(list.get(position).getUpdatedDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView contents_image;

    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        contents_image=itemView.findViewById(R.id. contents_imageview);

    }

    }
}
