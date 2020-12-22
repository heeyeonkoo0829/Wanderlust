package com.softsquared.template.src.Fragment_recommended_complete.top10;

import com.softsquared.template.src.Fragment_recommended_complete.models.Webtoon_Recommended_Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Webtoon_Recommended_top10_Retrofitinterface {

    @GET("/recommendation/top10")
    @Headers("Content-Type: application/json")
    Call<Webtoon_Recommended_top10_Response> get_recommended_top10(@Query("choice") String choice);
}
