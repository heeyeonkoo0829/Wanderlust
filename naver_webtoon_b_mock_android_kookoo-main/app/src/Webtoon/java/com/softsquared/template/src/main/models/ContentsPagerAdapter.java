package com.softsquared.template.src.Main.models;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

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
              TabFragment1 tab1=new TabFragment1();
              return tab1;
          case 1:
              TabFragment1 tab2=new TabFragment1();
              return tab2;
          case 2:
              TabFragment1 tab3=new TabFragment1();
              return tab3;
          case 3:
              TabFragment1 tab4=new TabFragment1();
              return tab4;
          case 4:
              TabFragment1 tab5=new TabFragment1();
              return tab5;
          case 5:
              TabFragment1 tab6=new TabFragment1();
              return tab6;
          case 6:
              TabFragment1 tab7=new TabFragment1();
              return tab7;
          case 7:
              TabFragment1 tab8=new TabFragment1();
              return tab8;
          case 8:
              TabFragment1 tab9=new TabFragment1();
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
