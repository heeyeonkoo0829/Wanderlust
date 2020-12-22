package com.softsquared.template.src.Fragment_webtoon.s;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Fri.Tab_Fri;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_New.Tab_New;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Mon.Tab_Mon;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Thur.Tab_Thur;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Tue.Tab_Tue;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Wed.Tab_Wed;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Sat.Tab_Sat;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Sun.Tab_Sun;
import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Complete.Tab_Complete;

public class ContentsPagerAdapter extends FragmentStatePagerAdapter{

    int num;
    public ContentsPagerAdapter(@NonNull FragmentManager fm, int behavior){
        super(fm);
        this.num=behavior;
    }




    @NonNull
    @Override
    public Fragment getItem(int position) {
      switch (position){
          case 0:
              Tab_New tab1=new Tab_New();
              return tab1;
          case 1:
              Tab_Mon tab2=new Tab_Mon();
              return tab2;
          case 2:
              Tab_Tue tab3=new Tab_Tue();
              return tab3;
          case 3:
              Tab_Wed tab4=new Tab_Wed();
              return tab4;
          case 4:
              Tab_Thur tab5=new Tab_Thur();
              return tab5;
          case 5:
              Tab_Fri tab6=new Tab_Fri();
              return tab6;
          case 6:
              Tab_Sat tab7=new Tab_Sat();
              return tab7;
          case 7:
              Tab_Sun tab8=new Tab_Sun();
              return tab8;
          case 8:
              Tab_Complete tab9=new Tab_Complete();
              return tab9;


          default:
              return null;

      }

    }

    @Override
    public int getCount() {
        return num;
    }
}
