package com.softsquared.template.src.Fragment_recommended_complete;

import com.softsquared.template.src.Fragment_recommended_complete.interfaces.Webtoon_Recommdned_ActivityView;
import com.softsquared.template.src.Fragment_recommended_complete.interfaces.Webtoon_Recommdned_RetrofitInterface;
import com.softsquared.template.src.Fragment_recommended_complete.models.Webtoon_Recommended_Response;
import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DisplayActivityView;
import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DisplayRetrofitInterface;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.softsquared.template.src.main.ApplicationClass.getRetrofit;

public class Webtoon_RecommendedService {
    private final Webtoon_Recommdned_ActivityView webtoon_recommended_activityView;

    public Webtoon_RecommendedService(Webtoon_Recommdned_ActivityView webtoon_recommended_activityView) {
        this.webtoon_recommended_activityView =  webtoon_recommended_activityView;
    }

    public void get_webtoonrecommended() {
        final Webtoon_Recommdned_RetrofitInterface boxOfifceRetrofitInterface = getRetrofit().create(Webtoon_Recommdned_RetrofitInterface.class);
        boxOfifceRetrofitInterface.get_recommended("update", "all").enqueue(new Callback<Webtoon_Recommended_Response>() {
            @Override
            public void onResponse(Call<Webtoon_Recommended_Response> call, Response<Webtoon_Recommended_Response> response) {
                final Webtoon_Recommended_Response webtoonResponse = response.body();
                if (webtoonResponse == null) {
                    webtoon_recommended_activityView.validateFailure(null);
                    return;
                }
                webtoon_recommended_activityView.validateSuccess(response.body().getWebtoonList());

                System.out.println("d");
                return;
            }


            @Override
            public void onFailure(Call<Webtoon_Recommended_Response> call, Throwable t) {
                webtoon_recommended_activityView.validateFailure(null);
                System.out.println(t.getMessage());
                System.out.println("");
            }

        });
    }
}
