package com.softsquared.template.src.Fragment_recommended_complete;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewDecoration  extends RecyclerView .ItemDecoration{


    private final int divWidth;

    public RecyclerViewDecoration(int divWidth)
    {
        this.divWidth = divWidth;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state)
    {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = divWidth;
        outRect.right= divWidth+10;
        outRect.left=divWidth+10;
    }}
