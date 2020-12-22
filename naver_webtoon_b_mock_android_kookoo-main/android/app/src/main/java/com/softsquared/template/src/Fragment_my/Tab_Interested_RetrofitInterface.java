package com.softsquared.template.src.Fragment_my;

import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Tab_Interested_RetrofitInterface {

    @GET("/interested")
    //@Headers("Content-Type: application/json")
    @Headers("X-ACCESS-TOKEN: X-ACCESS-TOKEN")
    Call<Tab_Interested_Response> get_interested();
}
