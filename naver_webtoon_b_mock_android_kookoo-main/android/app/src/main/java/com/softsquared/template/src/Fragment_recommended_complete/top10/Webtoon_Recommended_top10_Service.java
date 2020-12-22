package com.softsquared.template.src.Fragment_recommended_complete.top10;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.softsquared.template.src.main.ApplicationClass.getRetrofit;

public class Webtoon_Recommended_top10_Service {
    private final Webtoon_Recommended_top10_ActivityView webtoon_recommended_top10_activityView;

    public Webtoon_Recommended_top10_Service(Webtoon_Recommended_top10_ActivityView webtoon_recommended_top10_activityView) {
        this.webtoon_recommended_top10_activityView = webtoon_recommended_top10_activityView;
    }

    public void get_webtoonrecommended_top10() {
        final Webtoon_Recommended_top10_Retrofitinterface boxOfifceRetrofitInterface = getRetrofit().create(Webtoon_Recommended_top10_Retrofitinterface.class);
        boxOfifceRetrofitInterface.get_recommended_top10("best").enqueue(new Callback<Webtoon_Recommended_top10_Response>() {
            @Override
            public void onResponse(Call<Webtoon_Recommended_top10_Response> call, Response<Webtoon_Recommended_top10_Response> response) {
                final Webtoon_Recommended_top10_Response webtoonResponse = response.body();
                if (webtoonResponse == null) {
                    webtoon_recommended_top10_activityView.validateFailure(null);
                    return;
                }
                webtoon_recommended_top10_activityView.validateSuccess_top10(response.body().getwebtoonList());

                System.out.println("d");
                return;
            }


            @Override
            public void onFailure(Call<Webtoon_Recommended_top10_Response> call, Throwable t) {
                webtoon_recommended_top10_activityView.validateFailure(null);
                System.out.println(t.getMessage());
                System.out.println("");
            }

        });
    }
}
