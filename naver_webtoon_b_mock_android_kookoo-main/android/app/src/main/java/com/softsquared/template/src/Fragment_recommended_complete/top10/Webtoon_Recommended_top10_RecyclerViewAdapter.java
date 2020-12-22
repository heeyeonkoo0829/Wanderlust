package com.softsquared.template.src.Fragment_recommended_complete.top10;

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
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;
import com.softsquared.template.src.Fragment_recommended_complete.models.Webtoon_RecommendedRecyclerViewAdapter;

import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class Webtoon_Recommended_top10_RecyclerViewAdapter extends RecyclerView.Adapter<Webtoon_Recommended_top10_RecyclerViewAdapter.ItemHolder> {
    Context mContext;
    LayoutInflater mInflater;
    ArrayList<webtoonList> list;


    public Webtoon_Recommended_top10_RecyclerViewAdapter(ArrayList<webtoonList>list, Context context) {
        this.mContext = context;
        this.list=list;
        this.mInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Webtoon_Recommended_top10_RecyclerViewAdapter .ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =mInflater.inflate(R.layout.webtoonrecommendedtop10_item_layout,parent,false);
        return new Webtoon_Recommended_top10_RecyclerViewAdapter .ItemHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull Webtoon_Recommended_top10_RecyclerViewAdapter.ItemHolder holder, int position) {
        int i=1;
        String url = list.get(position).getThumbnailUrl();
        holder.webtoon_title.setText(list.get(position).getTitle());
        holder.webtoon_creator.setText(list.get(position).getCreator());
        holder.webtoon_ranking.setText(Integer.toString(list.get(position).getRanking()));


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
        TextView webtoon_title, webtoon_creator, webtoon_ranking;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            webtoon_thumnail = itemView.findViewById(R.id.webtoon_top10_thumbnail);
            webtoon_title = itemView.findViewById(R.id.webtoon_top10_title);
            webtoon_creator = itemView.findViewById(R.id.webtoon_top10_creator);
            webtoon_ranking = itemView.findViewById(R.id.webtoon_top10_ranking);//webtoon_top10_ranking
            webtoon_ranking.bringToFront();


        }


    }
}
