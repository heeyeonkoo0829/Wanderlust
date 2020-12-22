package com.softsquared.template.src.Fragment_webtoon.s.models;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_webtoon.s.Fragment_Fragment_Detail;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class WebtoonRecyclerViewAdapter extends RecyclerView.Adapter<WebtoonRecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    LayoutInflater mInflater;
    ArrayList<Result> list;
    //다음 상세화면으로 넘어가기위해..
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    Fragment_Fragment_Detail fragment_fragment_detail;




    public WebtoonRecyclerViewAdapter(ArrayList<Result>list,Context context) {
        this.mContext = context;
        this.list=list;
        this.mInflater=LayoutInflater.from(context);
        fragmentManager=((AppCompatActivity)mContext).getSupportFragmentManager();
        fragment_fragment_detail=new Fragment_Fragment_Detail();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =mInflater.inflate(R.layout.webtoondisplay_item_layout,parent,false);
        return new MyViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull WebtoonRecyclerViewAdapter.MyViewHolder holder, int position) {
        String url = list.get(position).getThumbnailUrl();
        holder.webtoon_title.setText(list.get(position).getTitle());
        holder.webtoon_star.setText(list.get(position).getStar());
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
    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView webtoon_thumnail;
        TextView webtoon_title,webtoon_star, webtoon_writer;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            webtoon_thumnail=itemView.findViewById(R.id.webtoon_thumnail);
            webtoon_title=itemView.findViewById(R.id.webtoon_title);
            webtoon_star=itemView.findViewById(R.id.webtoon_star);
            webtoon_writer=itemView.findViewById(R.id.webtoon_writer);

            //터치할때 상세조회하도록 하자!
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION){
                        int pickedItemIdx = list.get(pos).getWebtoonIdx();
                        Bundle bundle = new Bundle();
                        bundle.putInt("선택",pickedItemIdx);
                        fragment_fragment_detail.setArguments(bundle);
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frameLayout, fragment_fragment_detail).commit();


                    }
                }
            });

        }




        void onBind(Result result) {





        }
    }

    public class ViewHolder  {
    }
}
