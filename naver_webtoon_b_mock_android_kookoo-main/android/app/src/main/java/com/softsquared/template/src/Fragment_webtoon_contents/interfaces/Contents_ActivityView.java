package com.softsquared.template.src.Fragment_webtoon_contents.interfaces;

import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult;
import com.softsquared.template.src.Fragment_webtoon_contents.models.Contents_Result;

public interface Contents_ActivityView {
    void validateSuccess(Contents_Result contents_results);

    void validateFailure(String message);
}
