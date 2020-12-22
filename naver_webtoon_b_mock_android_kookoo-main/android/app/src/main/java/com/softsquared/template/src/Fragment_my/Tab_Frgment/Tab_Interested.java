package com.softsquared.template.src.Fragment_my.Tab_Frgment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.softsquared.template.R;
import com.softsquared.template.src.Fragment_my.Interested_webtoonList;
import com.softsquared.template.src.Fragment_my.Tab_Interested_ActivityView;
import com.softsquared.template.src.Fragment_my.Tab_Interested_RecyclerViewAdapter;
import com.softsquared.template.src.Fragment_my.Tab_Interested_Service;

import java.util.ArrayList;
import java.util.List;

public class Tab_Interested extends Fragment implements Tab_Interested_ActivityView {
    RecyclerView recyclerView_interested=null;
    Context context=null;
    private ArrayList<Interested_webtoonList> items_interested=new ArrayList<>();

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInsanceState){
        View view=inflater.inflate(R.layout.fragment_my_tab_interested,container,false);
        //관심웹툰 recyclerview구현하기
        recyclerView_interested=view.findViewById(R.id.tab_interested_recyclerview);

        LinearLayoutManager layoutManager_interested=new LinearLayoutManager(getActivity());
        recyclerView_interested.setLayoutManager(layoutManager_interested);
        Tab_Interested_RecyclerViewAdapter adapter_interested=new Tab_Interested_RecyclerViewAdapter(items_interested,getActivity());
        recyclerView_interested.setAdapter(adapter_interested);
        tryGetInterested();
        return view;
    }
    private void tryGetInterested(){
        final Tab_Interested_Service tab_interested_service=new Tab_Interested_Service(this);
        tab_interested_service.get_interested();
    }

    @Override
    public void validateSuccess(List<Interested_webtoonList> results) {
        items_interested=(ArrayList<Interested_webtoonList>)results;
        Tab_Interested_RecyclerViewAdapter adapter=new Tab_Interested_RecyclerViewAdapter(items_interested,getActivity());
        recyclerView_interested.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void validateFailure(String message) {

    }
}
