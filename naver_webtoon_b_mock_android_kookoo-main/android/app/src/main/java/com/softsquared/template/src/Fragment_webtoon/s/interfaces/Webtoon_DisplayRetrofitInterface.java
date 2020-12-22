package com.softsquared.template.src.Fragment_webtoon.s.interfaces;

import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResponse;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Webtoon_DisplayRetrofitInterface {
    @GET("/webtoon")
    @Headers("Content-Type: application/json")
    Call<WebtoonResponse>get_webtoondisplay(@Query("category") String category, @Query("sort")String sort);



}
