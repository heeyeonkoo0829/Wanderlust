package com.softsquared.template.src.Fragment_webtoon_contents.interfaces;

import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResponse;
import com.softsquared.template.src.Fragment_webtoon_contents.models.Contents_Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Contents_RetrofitInterface {
    @GET("/webtoon/{webtoonId}/episode/{episodeId}")
    Call<Contents_Response> getcontents(@Path("webtoonId") int webtoonId, @Path("episode") int episodeId);
}
