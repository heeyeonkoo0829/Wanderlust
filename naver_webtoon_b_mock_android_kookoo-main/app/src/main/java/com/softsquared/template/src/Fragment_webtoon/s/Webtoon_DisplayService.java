package com.softsquared.template.src.Fragment_webtoon.s;

import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DisplayActivityView;
import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DisplayRetrofitInterface;
import com.softsquared.template.src.Fragment_webtoon.s.models.WebtoonResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.softsquared.template.src.Main.ApplicationClass.getRetrofit;

public class Webtoon_DisplayService {
    private final Webtoon_DisplayActivityView webtoon_displayActivityView;

    public Webtoon_DisplayService(final Webtoon_DisplayActivityView webtoon_displayActivityView){
        this.webtoon_displayActivityView=webtoon_displayActivityView;
    }
    public void get_webtoondisplay() {
        final Webtoon_DisplayRetrofitInterface boxOfifceRetrofitInterface = getRetrofit().create(Webtoon_DisplayRetrofitInterface.class);
        boxOfifceRetrofitInterface.get_webtoondisplay("tue", "hot").enqueue(new Callback<WebtoonResponse>() {
            @Override
            public void onResponse(Call<WebtoonResponse> call, Response<WebtoonResponse> response) {
                final WebtoonResponse webtoonResponse = response.body();
                if (webtoonResponse == null) {
                    webtoon_displayActivityView.validateFailure(null);
                    return;
                }
                webtoon_displayActivityView.validateSuccess(response.body().getResult());

                System.out.println("d");
                return;
            }


            @Override
            public void onFailure(Call<WebtoonResponse> call, Throwable t) {
                webtoon_displayActivityView.validateFailure(null);
                System.out.println(t.getMessage());
                System.out.println("");
            }

        });
    }

}
