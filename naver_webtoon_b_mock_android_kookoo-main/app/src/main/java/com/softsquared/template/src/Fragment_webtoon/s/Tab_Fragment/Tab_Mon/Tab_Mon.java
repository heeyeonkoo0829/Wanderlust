package com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Mon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.softsquared.template.R;

public class Tab_Mon extends Fragment {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInsanceState){
        View view=inflater.inflate(R.layout.webtoon_display_recyclerview_mon,container,false);
        return view;
    }


}
