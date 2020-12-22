package com.softsquared.template.src.Fragment_recommended_complete.models;

import com.google.gson.annotations.Expose;

public class WebtoonRecommendedResponse {
    @Expose
    private WebtoonRecommendedResult webtoonRecommendedResult;
    public WebtoonRecommendedResponse(WebtoonRecommendedResult webtoonRecommendedResult){
        this.webtoonRecommendedResult=webtoonRecommendedResult;
    }

    public WebtoonRecommendedResult get_webtoondisplay() {
return webtoonRecommendedResult;
    }
}
