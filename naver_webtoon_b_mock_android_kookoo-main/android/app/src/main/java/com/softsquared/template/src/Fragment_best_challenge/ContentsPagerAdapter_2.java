package com.softsquared.template.src.Fragment_best_challenge;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_action;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_drama;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_emotional;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_episode;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_era;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_fantasy;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_gag;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_lovely;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_omnibus;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_routine;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_sports;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_story;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_thriller;
import com.softsquared.template.src.Fragment_best_challenge.Tab_Fragment.Tab_whole;

public class ContentsPagerAdapter_2 extends FragmentStatePagerAdapter {
    int num;

    public ContentsPagerAdapter_2(@NonNull FragmentManager fm, int num) {
        super(fm);
        this.num = num;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab_whole tab1=new Tab_whole();
                return tab1;
            case 1:
                Tab_lovely tab2=new Tab_lovely();
                return tab2;
            case 2:
                Tab_action tab3=new Tab_action();
                return tab3;
            case 3:
                Tab_sports tab4=new Tab_sports();
                return tab4;
            case 4:
                Tab_thriller tab5=new Tab_thriller();
                return tab5;
            case 5:
                Tab_fantasy tab6=new Tab_fantasy();
                return tab6;
            case 6:
                Tab_drama tab7=new Tab_drama();
                return tab7;
            case 7:
                Tab_routine tab8=new Tab_routine();
                return tab8;
            case 8:
                Tab_gag tab9=new Tab_gag();
                return tab9;
            case 9:
                Tab_emotional tab10=new Tab_emotional();
                return tab10;
            case 10:
                Tab_era tab11=new Tab_era();
                return tab11;
            case 11:
                Tab_story tab12=new Tab_story();
                return tab12;
            case 12:
                Tab_episode tab13=new Tab_episode();
                return tab13;
            case 13:
                Tab_omnibus tab14=new Tab_omnibus();
                return tab14;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return num;
    }
}
