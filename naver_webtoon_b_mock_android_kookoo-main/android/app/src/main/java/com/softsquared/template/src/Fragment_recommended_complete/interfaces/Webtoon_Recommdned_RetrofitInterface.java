package com.softsquared.template.src.Fragment_recommended_complete.interfaces;


import com.softsquared.template.src.Fragment_recommended_complete.models.Webtoon_Recommended_Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Webtoon_Recommdned_RetrofitInterface {

    @GET("/recommendation")
    @Headers("Content-Type: application/json")
   Call<Webtoon_Recommended_Response> get_recommended(@Query("sort") String sort, @Query("genre") String genre);


}
