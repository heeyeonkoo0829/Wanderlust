package com.softsquared.template.src.Fragment_webtoon.s.interfaces;

import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResponse;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Webtoon_DetailRetrofitInterface {


    @GET("/webtoon/{webtoonId}")
    Call<DetailResponse>getDetail(@Path("webtoonId") int webtoonId);

}

//public interface DetailRetrofitInterface {
//    @GET("/webtoons/{webtoonIdx}")
//    Call<DetailResponse> getDetail(
//      @Path("webtoonIdx")  int webtoonIdx
//    );
//
//    @GET("webtoons/{webtoonIdx}/episodes")
//    Call<DetailEpisodeListResponse> getDetailEpisodeList(
//            @Path("webtoonIdx")  int webtoonIdx
//    );
//}

//@GET("/webtoon")
//    @Headers("Content-Type: application/json")
//    Call<WebtoonResponse>get_webtoondisplay(@Query("category") String category, @Query("sort")String sort);