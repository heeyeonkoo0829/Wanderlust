package com.softsquared.template.src.Fragment_recommended_complete;


import android.content.Context;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.softsquared.template.R;

import java.util.ArrayList;

import com.softsquared.template.src.Fragment_recommended_complete.interfaces.Webtoon_Recommdned_ActivityView;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonRecommendedAdapter;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonRecommendedResponse;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonRecommendedResult;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonRecommendedService;

public class Fragment_recommeded_complete extends Fragment implements Webtoon_Recommdned_ActivityView {
    WebtoonRecommendedAdapter webtoonRecommendedAdapter;
    Context mcontext;
    RecyclerView recyclerView;
    ArrayList<WebtoonRecommendedResult>webtoonRecommendedResults;
    WebtoonRecommendedService webtoonRecommendedService;
    LinearLayoutManager linearLayoutManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_recommended_complete, container, false);
       webtoonRecommendedService=new WebtoonRecommendedService(this);
       webtoonRecommendedService.get_webtoondisplay();

       webtoonRecommendedResults=new ArrayList<>();
       recyclerView=v.findViewById(R.id.recommended_webtoon_item_recyclerview);
       linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
       recyclerView.setLayoutManager(linearLayoutManager);
       if(getActivity()!=null){
           webtoonRecommendedAdapter=new WebtoonRecommendedAdapter(v.getContext(),webtoonRecommendedResults);
           recyclerView.setAdapter(webtoonRecommendedAdapter);
           webtoonRecommendedAdapter.notifyDataSetChanged();
       }
        webtoonRecommendedAdapter=new WebtoonRecommendedAdapter(v.getContext(),webtoonRecommendedResults);
        recyclerView.setAdapter(webtoonRecommendedAdapter);
        webtoonRecommendedAdapter.notifyDataSetChanged();
         return v;
    }


    @Override
    public void validateSuccess(String text) {

    }

    @Override
    public void validateFailure(String message) {

    }

    @Override
    public void SuccessBoxOffice(WebtoonRecommendedResponse webtoonRecommendedResponse) {

    }
}