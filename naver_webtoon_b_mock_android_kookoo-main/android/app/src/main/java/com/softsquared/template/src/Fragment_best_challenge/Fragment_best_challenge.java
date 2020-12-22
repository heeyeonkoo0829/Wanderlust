package com.softsquared.template.src.Fragment_best_challenge;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_my.ContentsPagerAdapter_3;

public class Fragment_best_challenge extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TabLayout mTabLayout;
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_best_challenge, container, false);
        mTabLayout=v.findViewById(R.id.webtoon_tab2);
        final ViewPager mViewPager_2;
        final ContentsPagerAdapter_2 mContentsPagerAdapter_2;

        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("전체")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("순정")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("액션")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("스포츠")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("스릴러")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("판타지")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("드라마")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("일상")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("개그")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("감성")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("시대극")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("스토리")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("에피소드")));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(createTabView("옴니버스")));

        //fragment가져오기
        mViewPager_2 = (ViewPager) v.findViewById(R.id .webtoon_viewPager2);
        mViewPager_2.bringToFront();
        mContentsPagerAdapter_2=new ContentsPagerAdapter_2(getChildFragmentManager(),mTabLayout.getTabCount());
        mViewPager_2.setAdapter(mContentsPagerAdapter_2);
        mViewPager_2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override

            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager_2.setCurrentItem(tab.getPosition());
                mContentsPagerAdapter_2.notifyDataSetChanged();
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