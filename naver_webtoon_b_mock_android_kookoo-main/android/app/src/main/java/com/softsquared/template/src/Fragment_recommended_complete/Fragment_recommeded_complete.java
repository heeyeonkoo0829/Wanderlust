package com.softsquared.template.src.Fragment_recommended_complete;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_recommended_complete.interfaces.Webtoon_Recommdned_ActivityView;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;
import com.softsquared.template.src.Fragment_recommended_complete.models.Webtoon_RecommendedRecyclerViewAdapter;
import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_ActivityView;
import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_RecyclerViewAdapter;
import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_Service;
import com.softsquared.template.src.Fragment_recommended_complete.top10.webtoonList;
import com.softsquared.template.src.Fragment_webtoon.s.Webtoon_DisplayService;
import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DisplayActivityView;
import com.softsquared.template.src.Fragment_webtoon.s.models.Result;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static android.widget.LinearLayout.HORIZONTAL;

public class Fragment_recommeded_complete extends Fragment implements Webtoon_Recommdned_ActivityView, Webtoon_Recommended_top10_ActivityView {
    private ViewPager viewPager;
    private ImageViewPagerAdapter pagerAdapter;

    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 500;
    final long PERIOD_MS = 3000;
    private ArrayList<WebtoonList> items=new ArrayList<>();
    private ArrayList<webtoonList>items_top10=new ArrayList<>();
    RecyclerView recyclerView=null;
    RecyclerView recyclerView_top10=null;
    Context context=null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recommended_complete, container, false);
        viewPager = (ViewPager) (view.findViewById(R.id.viewPager));
        pagerAdapter = new ImageViewPagerAdapter(getActivity());
        viewPager.setAdapter(pagerAdapter);
        final TextView textView = (TextView) view.findViewById(R.id.viewpager_page_count_text);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentPage = position;
                textView.setText(currentPage + 1 + " / 10");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        final Handler handler = new Handler();
        final Runnable pagerRunnable = new Runnable() {
            @Override
            public void run() {
                if (currentPage == 10) {
                    currentPage = 0;
                }

                viewPager.setCurrentItem(currentPage++, true);
                //textView.setText(viewPager.getCurrentItem()+1+" / 10");

            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(pagerRunnable);
            }
        }, DELAY_MS, PERIOD_MS);


        //TOP10 추천완결 recyclerview 만들기
        recyclerView_top10=(RecyclerView)view.findViewById(R.id. recommended_webtoontop10_item_recyclerview);
        recyclerView_top10.setHasFixedSize(true);

        @SuppressLint("WrongConstant") LinearLayoutManager layoutManager_top10=new LinearLayoutManager(getActivity(), HORIZONTAL,false);
        recyclerView_top10.setLayoutManager(layoutManager_top10);
        Webtoon_Recommended_top10_RecyclerViewAdapter adapter_top10=new Webtoon_Recommended_top10_RecyclerViewAdapter(items_top10,getActivity());
        recyclerView_top10.setAdapter(adapter_top10);
        tryGetWebtoonList_top10();
        //추천완결 recyclerview만들기

        recyclerView=(RecyclerView)view.findViewById(R.id. recommended_webtoon_item_recyclerview);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Webtoon_RecommendedRecyclerViewAdapter adapter=new Webtoon_RecommendedRecyclerViewAdapter(items,getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecyclerViewDecoration(80));
        tryGetWebtoonList();

        return  view;
    }
    private void tryGetWebtoonList(){
        final Webtoon_RecommendedService webtoon_recommendedService=new Webtoon_RecommendedService(this);
        webtoon_recommendedService.get_webtoonrecommended();

    }
    private void tryGetWebtoonList_top10(){
        final Webtoon_Recommended_top10_Service webtoon_recommended_top10_service=new Webtoon_Recommended_top10_Service(this);
        webtoon_recommended_top10_service.get_webtoonrecommended_top10();

    }
    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void validateSuccess(List<WebtoonList> results) {
        items=(ArrayList<WebtoonList>)results;
        Webtoon_RecommendedRecyclerViewAdapter adapter = new Webtoon_RecommendedRecyclerViewAdapter(items,getActivity());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    @Override
    public void validateSuccess_top10(List<webtoonList> results) {
        items_top10=(ArrayList<webtoonList>)results;
        Webtoon_Recommended_top10_RecyclerViewAdapter adapter = new  Webtoon_Recommended_top10_RecyclerViewAdapter(items_top10,getActivity());
        recyclerView_top10.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void validateFailure(String message) {

    }
}