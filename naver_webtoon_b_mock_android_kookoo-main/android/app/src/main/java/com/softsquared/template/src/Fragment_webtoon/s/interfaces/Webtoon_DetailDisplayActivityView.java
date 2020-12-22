package com.softsquared.template.src.Fragment_webtoon.s.interfaces;

import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult_2;
import com.softsquared.template.src.Fragment_webtoon.s.models.Result;

import java.util.List;

public interface Webtoon_DetailDisplayActivityView {
    void validateSuccess(DetailResult results);

    void validateFailure(String message);
}
