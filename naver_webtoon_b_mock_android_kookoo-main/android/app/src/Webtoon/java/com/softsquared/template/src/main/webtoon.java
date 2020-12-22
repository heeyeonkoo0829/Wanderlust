package com.softsquared.template.src.Main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.softsquared.template.R;
import com.softsquared.template.src.Main.models.AutoScrollAdapter;
import com.softsquared.template.src.Main.models.ContentsPagerAdapter;

import java.util.ArrayList;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;


public class webtoon extends Fragment {
    FrameLayout highest_framelayout;
    AutoScrollViewPager autoScrollViewPager;
    ArrayList<String>data =new ArrayList<>();
    TabLayout mTabLayout;
    ContentsPagerAdapter mContentsPagerAdapter;
    ViewPager mViewPager;
    private Context mContext;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_webtoon, container, false);




        ArrayList<String> data = new ArrayList<>(); //이미지 url를 저장하는 arraylist
        data.add("https://cdn.mediasr.co.kr/news/photo/201906/53152_14624_1747.jpg");
        data.add("https://img.hankyung.com/photo/202010/BF.24245665.1.jpg");
        data.add("https://mblogthumb-phinf.pstatic.net/MjAxODA2MDVfMzUg/MDAxNTI4MTc2NzE0NTE5.0eccXvNDQpVrbPqAIzLvvWUf9PFCXuWVNUu5CKFn6Mwg.1MQVjF_Q4F_4EXTbXvPie5NA0PBTDkEotVF24jDojtUg.PNG.kaa1205aa/%EC%97%AC%EC%A4%91%EC%83%9Da01.png?type=w800");
        data.add("https://img.huffingtonpost.com/asset/5f5d81f524000006109222b6.jpeg?cache=rrYKc9N6Hn&ops=scalefit_630_noupscale");
        autoScrollViewPager = (AutoScrollViewPager)v.findViewById(R.id.autoViewPager);
        AutoScrollAdapter scrollAdapter = new AutoScrollAdapter(getActivity(), data);
        autoScrollViewPager.setAdapter(scrollAdapter); //Auto Viewpager에 Adapter 장착
        autoScrollViewPager.setInterval(3000); // 페이지 넘어갈 시간 간격 설정
        autoScrollViewPager.startAutoScroll(); //Auto Scroll 시작
        highest_framelayout=(FrameLayout)v. findViewById(R.id.highest_framelayout);
        highest_framelayout.bringToFront();
        //tab
        mTabLayout=v.findViewById(R.id.webtoon_tab);
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("신작")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("월")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("화")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("수")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("목")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("금")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("토")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("일")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("완결")));





        //fragment가져오기
        mViewPager = (ViewPager) v.findViewById(R.id.webtoon_viewPager);
        mContentsPagerAdapter=new ContentsPagerAdapter(getChildFragmentManager(),mTabLayout.getTabCount());
        mViewPager.setAdapter(mContentsPagerAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override

            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
                mContentsPagerAdapter.notifyDataSetChanged();
            }



            @Override

            public void onTabUnselected(TabLayout.Tab tab) {
            }



            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        return v;




        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_webtoon, container, false);
    }
    private  View createTabView(String tabName)
    { View tabView = LayoutInflater.from(this.getContext()).inflate(R.layout.custom_tab, null);
        TextView txt_name = (TextView) tabView.findViewById(R.id.txt_name);
        txt_name.setText(tabName);
        return tabView;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}


