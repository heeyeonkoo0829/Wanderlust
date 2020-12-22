package com.softsquared.template.src.Fragment_recommended_complete.models;


import com.softsquared.template.src.Fragment_recommended_complete.interfaces.Webtoon_Recommdned_ActivityView;
import com.softsquared.template.src.Fragment_recommended_complete.interfaces.Webtoon_Recommdned_RetrofitInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.softsquared.template.src.Main.ApplicationClass.getRetrofit;

public class WebtoonRecommendedService {
   private final Webtoon_Recommdned_ActivityView webtoon_recommdned_activityView;
   public WebtoonRecommendedService (final Webtoon_Recommdned_ActivityView webtoon_recommdned_activityView){
       this.webtoon_recommdned_activityView=webtoon_recommdned_activityView;
   }
    public void get_webtoondisplay() {
        final Webtoon_Recommdned_RetrofitInterface boxOfifceRetrofitInterface = getRetrofit().create(Webtoon_Recommdned_RetrofitInterface.class);
       boxOfifceRetrofitInterface.get_webtoondisplay("mon", "hot").enqueue(new Callback<WebtoonRecommendedResponse>() {
            @Override
            public void onResponse(Call<WebtoonRecommendedResponse> call, Response<WebtoonRecommendedResponse> response) {
                final WebtoonRecommendedResponse webtoonResponse = response.body();
                if (webtoonResponse == null) {
                    webtoon_recommdned_activityView.validateFailure(null);
                    return;
                }
                webtoon_recommdned_activityView.SuccessBoxOffice(webtoonResponse);

                System.out.println("d");

            }


            @Override
            public void onFailure(Call<WebtoonRecommendedResponse> call, Throwable t) {
                webtoon_recommdned_activityView.validateFailure(null);
                System.out.println(t.getMessage());
                System.out.println("");
            }

        });
    }

}
