package com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Tab_Fri;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_webtoon.s.Webtoon_DisplayService;
import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DisplayActivityView;
import com.softsquared.template.src.Fragment_webtoon.s.models.Result;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class Tab_Fri extends Fragment implements Webtoon_DisplayActivityView {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    private ArrayList<Result> items=new ArrayList<>();
    RecyclerView recyclerView=null;
    Context context=null;
    public Tab_Fri(){}

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,  Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.webtoon_display_recyclerview_fri,container,false);
        context = view.getContext();
        recyclerView = (RecyclerView) view.findViewById(R.id.webtoon_display_recyclerview_fri);
        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(context);

        GridLayoutManager layoutManager = new GridLayoutManager(context,3);
        recyclerView.setLayoutManager(layoutManager);
        WebtoonRecyclerViewAdapter adapter = new WebtoonRecyclerViewAdapter(items,context);
        recyclerView.setAdapter(adapter);
        tryGetWebtoonList();
        return view;
    }

    private void tryGetWebtoonList(){
        final Webtoon_DisplayService webtoon_displayService=new Webtoon_DisplayService(this);
        webtoon_displayService.get_webtoondisplay_fri();

    }



    @Override
    public void validateSuccess(List<Result> results) {
        items=(ArrayList<Result>)results;
        WebtoonRecyclerViewAdapter adapter = new WebtoonRecyclerViewAdapter(items,context);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void validateFailure(String message) {

    }



}
