package com.softsquared.template.src.Fragment_recommended_complete.interfaces;


import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonRecommendedResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Webtoon_Recommdned_RetrofitInterface {

    @GET("/webtoon")
    @Headers("Content-Type: application/json")
   Call<WebtoonRecommendedResponse> get_webtoondisplay(@Query("week") String week, @Query("sort") String sort);


}
