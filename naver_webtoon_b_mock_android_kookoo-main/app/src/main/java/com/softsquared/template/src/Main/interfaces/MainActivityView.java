package com.softsquared.template.src.Main.interfaces;

import com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment.Item;
import com.softsquared.template.src.Fragment_webtoon.s.models.Result;

import java.util.List;

public interface MainActivityView {

    void validateSuccess(List<Result> results);

    void validateFailure(String message);
}
