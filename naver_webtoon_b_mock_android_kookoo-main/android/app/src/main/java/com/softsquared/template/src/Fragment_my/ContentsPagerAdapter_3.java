package com.softsquared.template.src.Fragment_my;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.softsquared.template.src.Fragment_my.Tab_Frgment.Tab_Interested;
import com.softsquared.template.src.Fragment_my.Tab_Frgment.Tab_Recent;
import com.softsquared.template.src.Fragment_my.Tab_Frgment.Tab_paid;
import com.softsquared.template.src.Fragment_my.Tab_Frgment.Tab_storage;
import com.softsquared.template.src.Fragment_my.Tab_Frgment.Tab_temporary;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Complete.Tab_Complete;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Fri.Tab_Fri;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Mon.Tab_Mon;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_New.Tab_New;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Sat.Tab_Sat;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Sun.Tab_Sun;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Thur.Tab_Thur;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Tue.Tab_Tue;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Wed.Tab_Wed;

public class ContentsPagerAdapter_3 extends FragmentStatePagerAdapter {
    int num;

    public ContentsPagerAdapter_3(@NonNull FragmentManager fm, int num) {
        super(fm);
        this.num = num;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab_Interested tab1=new Tab_Interested();
                return tab1;
            case 1:
                Tab_Recent tab2=new Tab_Recent();
                return tab2;
            case 2:
                Tab_temporary tab3=new Tab_temporary();
                return tab3;
            case 3:
                Tab_storage tab4=new Tab_storage();
                return tab4;
            case 4:
                Tab_paid tab5=new Tab_paid();
                return tab5;


            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return num;
    }
}
