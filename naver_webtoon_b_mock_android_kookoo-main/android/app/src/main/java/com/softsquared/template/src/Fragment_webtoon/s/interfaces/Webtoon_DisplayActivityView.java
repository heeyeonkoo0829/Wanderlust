package com.softsquared.template.src.Fragment_webtoon.s.interfaces;

import com.softsquared.template.src.Fragment_webtoon.s.models.Result;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonResponse;

import java.util.List;

public interface Webtoon_DisplayActivityView {

    void validateSuccess(List<Result> results);

    void validateFailure(String message);


}
