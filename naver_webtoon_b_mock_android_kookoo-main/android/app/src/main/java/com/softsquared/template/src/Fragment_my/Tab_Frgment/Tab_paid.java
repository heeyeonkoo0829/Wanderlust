package com.softsquared.template.src.Fragment_my.Tab_Frgment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.softsquared.template.R;

public class Tab_paid  extends Fragment {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInsanceState){
        View view=inflater.inflate(R.layout.fragment_my_tab_paid,container,false);
        return view;
    }
}
