package com.softsquared.template.src.Fragment_recommended_complete.top10;

import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;

import java.util.List;

public interface Webtoon_Recommended_top10_ActivityView {

    void validateSuccess_top10(List<webtoonList> results);

    void validateFailure(String message);
}
