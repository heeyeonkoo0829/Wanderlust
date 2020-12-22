package com.softsquared.template.src.Fragment_webtoon.s;

import android.util.Log;

import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DetailDisplayActivityView;
import com.softsquared.template.src.Fragment_webtoon.s.interfaces.Webtoon_DetailRetrofitInterface;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResponse;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.softsquared.template.src.main.ApplicationClass.getRetrofit;

public class Webtoon_DetailDisplayService {
    private final Webtoon_DetailDisplayActivityView webtoon_detailDisplayActivityView;
    private final int num;


    public Webtoon_DetailDisplayService( Webtoon_DetailDisplayActivityView webtoon_displayActivityView, int num){
        this.webtoon_detailDisplayActivityView=webtoon_displayActivityView;
        this.num = num;
    }
    public void get_detail() {
        final Webtoon_DetailRetrofitInterface boxOfifceRetrofitInterface = getRetrofit().create(Webtoon_DetailRetrofitInterface.class);
        boxOfifceRetrofitInterface.getDetail(num).enqueue(new Callback<DetailResponse>() {
            @Override
            public void onResponse(Call<DetailResponse> call, Response<DetailResponse> response) {


                final DetailResponse webtoonResponse = response.body();
                if (webtoonResponse == null) {
                    webtoon_detailDisplayActivityView.validateFailure(null);
                    return;
                }
                Log.d("ㅠㅠ","일단 서비스진입");
                webtoon_detailDisplayActivityView.validateSuccess(response.body().getResult());
                Log.d("ㅠㅠ","서비스 성공");
                return;
            }


            @Override
            public void onFailure(Call<DetailResponse> call, Throwable t) {
                webtoon_detailDisplayActivityView.validateFailure(null);
                System.out.println(t.getMessage());
                System.out.println("");
            }

        });
    }

}
