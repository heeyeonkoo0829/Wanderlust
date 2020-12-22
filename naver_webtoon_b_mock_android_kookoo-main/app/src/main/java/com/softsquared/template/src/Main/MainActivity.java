package com.softsquared.template.src.Main;



import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_best_challenge.Fragment_best_challenge;
import com.softsquared.template.src.Fragment_more_info.Fragment_more_info;
import com.softsquared.template.src.Fragment_my.Fragment_my;
import com.softsquared.template.src.Fragment_recommended_complete.Fragment_recommeded_complete;
import com.softsquared.template.src.Fragment_webtoon.s.Fragment_webtoon;

public class MainActivity extends BaseActivity {

    // FrameLayout에 각 메뉴의 Fragment를 바꿔 줌
    private FragmentManager fragmentManager = getSupportFragmentManager();
    // 5개의 메뉴에 들어갈 Fragment들
    private Fragment_webtoon menu1Fragment = new Fragment_webtoon();
    private Fragment_recommeded_complete menu2Fragment = new Fragment_recommeded_complete();
    private Fragment_best_challenge menu3Fragment = new Fragment_best_challenge();
    private Fragment_my menu4Fragment = new Fragment_my();
    private Fragment_more_info menu5Fragment=new Fragment_more_info();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 첫 화면 지정
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, menu1Fragment).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_view);
        bottomNavigationView.setItemIconTintList(null);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.webtoon: {
                        transaction.replace(R.id.frameLayout, menu1Fragment).addToBackStack("1");
                        break;
                    }
                    case R.id.recommended_complete: {
                        transaction.replace(R.id.frameLayout, menu2Fragment).addToBackStack("2");
                        break;
                    }
                    case R.id.best_challenge: {
                        transaction.replace(R.id.frameLayout, menu3Fragment).addToBackStack("3");
                        break;
                    }
                    case R.id.my: {
                        transaction.replace(R.id.frameLayout, menu4Fragment).addToBackStack("4");
                        break;
                    }
                    case R.id.more_info: {
                        transaction.replace(R.id.frameLayout, menu5Fragment).addToBackStack("5");
                        break;
                    }
                }
                fragmentManager.popBackStack();
                transaction.commitAllowingStateLoss();
                return true;
            }
        });

    }
}