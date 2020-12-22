package com.softsquared.template.src.Fragment_webtoon_contents;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_RecyclerViewAdapter;
import com.softsquared.template.src.Fragment_webtoon.s.Webtoon_DetailDisplayService;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult_2;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonDetailRecyclerViewAdapter;
import com.softsquared.template.src.Fragment_webtoon_contents.interfaces.Contents_ActivityView;
import com.softsquared.template.src.Fragment_webtoon_contents.models.Contents_ContentsUrl;
import com.softsquared.template.src.Fragment_webtoon_contents.models.Contents_Result;

import java.util.ArrayList;

import static android.widget.LinearLayout.HORIZONTAL;
import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class Fragment_webtoon_contents extends AppCompatActivity implements Contents_ActivityView {
    Contents_Result contents_result;
    ImageView contents_imageview;
    ArrayList<Contents_ContentsUrl> contents_contentsUrls = new ArrayList<Contents_ContentsUrl>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_webtoon_contents);


        RecyclerView mrecyclerView;
        Context mContext;

        //일단 webtoonidx와 episodeidx를 가져오자!
        Intent intent=getIntent();
       int webtoonidx=intent.getExtras().getInt("내가 고른 웹툰");


       String episodeidx=intent.getExtras().getString("내가고른 에피소드");
        int episodeidx_real=Integer.parseInt(episodeidx);

        mrecyclerView=findViewById(R.id. contents_recyclerview);
        mrecyclerView.setHasFixedSize(true);

        @SuppressLint("WrongConstant")
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, HORIZONTAL,false);
        mrecyclerView.setLayoutManager(layoutManager);
        Contents_RecyclerViewAdapter adapter=new  Contents_RecyclerViewAdapter( contents_contentsUrls,this);
        mrecyclerView.setAdapter(adapter);
        tryGetContentsUrl(webtoonidx,episodeidx_real);
    }


    public void tryGetContentsUrl(int idx1,int idx2){
        final Contents_Service contents_service=new Contents_Service(this,idx1,idx2);
        contents_service.get_contents();
    }

    @Override
    public void validateSuccess(Contents_Result contents_results) {
        contents_result=contents_results;
        Log.d("nn","validateSuccess");
        contents_contentsUrls=(ArrayList<Contents_ContentsUrl>)contents_result.getContents_url();

    }

    @Override
    public void validateFailure(String message) {

    }

}
