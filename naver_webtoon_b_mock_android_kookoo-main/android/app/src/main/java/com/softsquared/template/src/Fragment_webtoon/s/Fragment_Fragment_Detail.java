package com.softsquared.template.src.Fragment_webtoon.s;

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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DetailDisplayActivityView;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult_2;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonDetailRecyclerViewAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class Fragment_Fragment_Detail extends Fragment implements Webtoon_DetailDisplayActivityView {
    private ArrayList<DetailResult_2> mDetailResult_2=new ArrayList<DetailResult_2>();
    private DetailResult mDetailResult;
    RecyclerView mrecyclerView;
    Context mContext;
    RequestManager mGlideRequestManager;
    ImageView detail_thumbnail,detail_color;
    TextView detail_title,detail_creator,detail_week, detail_summary;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_detail,container,false);

        mGlideRequestManager = Glide.with(view.getContext());
        ArrayList<DetailResult_2> detailEpisodeListResults = new ArrayList<>();
        int idx=0;
        Bundle bundle = getArguments();
        if(bundle != null){
            idx = bundle.getInt("선택");
        }


        mrecyclerView = view.findViewById(R.id.detail_recyclerview);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        WebtoonDetailRecyclerViewAdapter adapter = new WebtoonDetailRecyclerViewAdapter(mDetailResult_2,view.getContext(),mGlideRequestManager);
        mrecyclerView.setAdapter(adapter);
        tryGetDetail(idx);

        detail_thumbnail = view.findViewById(R.id.detail_thumbnail);
        detail_title = view.findViewById(R.id.detail_title);
        detail_creator = view.findViewById(R.id.detail_creator);
        detail_week=view.findViewById(R.id. detail_week);
        detail_summary=view.findViewById(R.id. detail_summary);
        //detail_color=view.findViewById(R.id.detail_color);


        return view;
    }
    public void tryGetDetail(int idx){
        final Webtoon_DetailDisplayService fragmentDetailService = new Webtoon_DetailDisplayService(this,idx);
        fragmentDetailService.get_detail();
    }



    @Override
    public void validateSuccess(DetailResult results) {
        mDetailResult =  results;
        Log.d("ㅠㅠ","validateSuccess");
        mDetailResult_2= (ArrayList<DetailResult_2>) mDetailResult.getEpisode();
        Log.d("ㅠㅠ","getepisode가성공?");


        String url =mDetailResult .getThumbnailUrl();
        mGlideRequestManager
                .load(url)
                .centerCrop()
                .transition(withCrossFade())
                .into(detail_thumbnail);

        detail_title.setText(mDetailResult.getTitle());
        detail_creator.setText(mDetailResult.getCreator());
        detail_week.setText(mDetailResult.getWeek());
        detail_summary.setText(mDetailResult.getSummary());
        String a=mDetailResult.getColor();

        //detail_color.setBackgroundColor(Integer.parseInt("#EDB100"));

        WebtoonDetailRecyclerViewAdapter adapter = new  WebtoonDetailRecyclerViewAdapter( mDetailResult_2,mContext,mGlideRequestManager);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void validateFailure(String message) {

    }
}
