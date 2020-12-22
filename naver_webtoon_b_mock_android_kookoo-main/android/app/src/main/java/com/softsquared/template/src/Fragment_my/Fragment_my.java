package com.softsquared.template.src.Fragment_my;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_my.Tab_Frgment.Tab_Interested;
import com.softsquared.template.src.Fragment_webtoon.s.ContentsPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class Fragment_my extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TabLayout mTabLayout;
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_my, container, false);
        mTabLayout=v.findViewById(R.id.webtoon_tab3);
        final ViewPager mViewPager_3;
        final ContentsPagerAdapter_3 mContentsPagerAdapter_3;





                mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("관심웹툰")));
                mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("최근 본 웹툰")));
                mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("임시저장 웹툰")));
                mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("보관함")));
                mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("결제내역")));

        //fragment가져오기
        mViewPager_3 = (ViewPager) v.findViewById(R.id .webtoon_viewPager3);
        mViewPager_3.bringToFront();
        mContentsPagerAdapter_3=new ContentsPagerAdapter_3(getChildFragmentManager(),mTabLayout.getTabCount());
        mViewPager_3.setAdapter(mContentsPagerAdapter_3);
        mViewPager_3.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override

            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager_3.setCurrentItem(tab.getPosition());
                mContentsPagerAdapter_3.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


        return v;


    }
    @Override
    public void onStart() {
        super.onStart();

    }

    private  View createTabView(String tabName)
    { View tabView = LayoutInflater.from(this.getContext()).inflate(R.layout.custom_tab_3, null);
        TextView txt_name = (TextView) tabView.findViewById(R.id.txt_name_3);
        txt_name.setText(tabName);
        return tabView;
    }





}