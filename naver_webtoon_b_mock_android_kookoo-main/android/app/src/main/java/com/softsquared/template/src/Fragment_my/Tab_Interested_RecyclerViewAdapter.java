package com.softsquared.template.src.Fragment_my;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.softsquared.template.R;


import java.util.ArrayList;

import static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions.withCrossFade;


public class Tab_Interested_RecyclerViewAdapter extends RecyclerView.Adapter<Tab_Interested_RecyclerViewAdapter.ItemHolder>{
    Context mContext;
    LayoutInflater mInflater;
    ArrayList<Interested_webtoonList> list;


    public Tab_Interested_RecyclerViewAdapter(ArrayList<Interested_webtoonList>list, Context context) {
        this.mContext = context;
        this.list=list;
        this.mInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Tab_Interested_RecyclerViewAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =mInflater.inflate(R.layout.tab_interested,parent,false);
        return new Tab_Interested_RecyclerViewAdapter .ItemHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull Tab_Interested_RecyclerViewAdapter.ItemHolder holder, int position) {

        String url = list.get(position).getThumbnailUrl();
        holder.webtoon_title.setText(list.get(position).getTitle());
        holder.webtoon_date.setText(list.get(position).getUpdatedAt());


        Glide.with(mContext)
                .load(url)
                .centerCrop()

                .into(holder.webtoon_thumnail);

//.transition(withCrossFade())
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ItemHolder extends RecyclerView.ViewHolder {

        ImageView webtoon_thumnail;
        TextView webtoon_title, webtoon_date;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            webtoon_thumnail = itemView.findViewById(R.id.tab_interested_thumbnail);
            webtoon_title = itemView.findViewById(R.id.tab_interested_title);
            webtoon_date = itemView.findViewById(R.id.tab_interested_date);



        }


    }
}
