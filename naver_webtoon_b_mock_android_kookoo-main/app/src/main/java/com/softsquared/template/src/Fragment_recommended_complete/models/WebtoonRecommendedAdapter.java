package com.softsquared.template.src.Fragment_recommended_complete.models;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softsquared.template.R;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class WebtoonRecommendedAdapter extends RecyclerView.Adapter<WebtoonRecommendedAdapter.ItemHolder> {

    private Context mContext;
    LayoutInflater mInflater;
    ArrayList<WebtoonRecommendedResult>mWebtoonData;

    public WebtoonRecommendedAdapter(Context mContext, ArrayList<WebtoonRecommendedResult> mWebtoonData) {
        this.mContext = mContext;
        this.mWebtoonData = mWebtoonData;
        mInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public WebtoonRecommendedAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v=mInflater.inflate(R.layout.recommended_webtoon_item_layout,parent,false);
       return new WebtoonRecommendedAdapter.ItemHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull WebtoonRecommendedAdapter.ItemHolder holder, int position) {
        holder.onBind(mWebtoonData.get(position));
    }

    @Override
    public int getItemCount() {
   return mWebtoonData.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder{
        ImageView webtoon_thumnail;
        TextView webtoon_title,webtoon_writers, webtoon_description;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            webtoon_thumnail=itemView.findViewById(R.id.webtoon_thumnail);
            webtoon_title=itemView.findViewById(R.id.webtoon_title);
            webtoon_writers=itemView.findViewById(R.id.webtoon_writers);
            webtoon_description=itemView.findViewById(R.id.webtoon_description);
        }

        private Bitmap getImageBitmap(String url) {
            Bitmap bm = null;
            try {
                URL aURL = new URL(url);
                URLConnection conn = aURL.openConnection();
                conn.connect();
                InputStream is = conn.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(is);
                bm = BitmapFactory.decodeStream(bis);
                bis.close();
                is.close();
            } catch (IOException e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();

            }
            return bm;
        }
        void onBind(WebtoonRecommendedResult webtoonResult ) {
            Bitmap bitmap_changed_thumnail;
            bitmap_changed_thumnail=getImageBitmap(webtoonResult.getThumbnailUrl());
            webtoon_thumnail.setImageBitmap(bitmap_changed_thumnail);
            webtoon_thumnail.setImageBitmap(bitmap_changed_thumnail);
            webtoon_title.setText(webtoonResult.getTitle());
            webtoon_writers.setText((int) webtoonResult.getStar());
            webtoon_description.setText(webtoonResult.getCreator());




        }
    }
}
