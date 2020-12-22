package com.softsquared.template.src.Fragment_recommended_complete.interfaces;


import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonRecommendedResponse;

public interface Webtoon_Recommdned_ActivityView {

    void validateSuccess(String text);

    void validateFailure(String message);

    void SuccessBoxOffice(WebtoonRecommendedResponse webtoonRecommendedResponse);
}
