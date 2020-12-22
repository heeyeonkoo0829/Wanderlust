package com.softsquared.template.src.Fragment_webtoon_contents;

import android.util.Log;
import com.softsquared.template.src.Fragment_webtoon_contents.interfaces.Contents_ActivityView;
import com.softsquared.template.src.Fragment_webtoon_contents.interfaces.Contents_RetrofitInterface;
import com.softsquared.template.src.Fragment_webtoon_contents.models.Contents_Response;
import com.softsquared.template.src.Fragment_webtoon_contents.models.Contents_Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.softsquared.template.src.main.ApplicationClass.getRetrofit;

public class Contents_Service {
    private final Contents_ActivityView contents_activityView;
    private final int num1,num2;


    public Contents_Service(Contents_ActivityView contents_activityView, int num1,int num2) {
        this.contents_activityView = contents_activityView;
        this.num1 = num1;
        this.num2=num2;
    }

    public void get_contents() {
        final Contents_RetrofitInterface boxOfifceRetrofitInterface = getRetrofit().create(Contents_RetrofitInterface.class);
        boxOfifceRetrofitInterface.getcontents(num1,num2).enqueue(new Callback<Contents_Response>() {
            @Override
            public void onResponse(Call<Contents_Response> call, Response<Contents_Response> response) {


                final Contents_Response webtoonResponse = response.body();
                if (webtoonResponse == null) {
                    contents_activityView.validateFailure(null);
                    return;
                }
                Log.d("ㅠㅠ","일단 서비스진입");
                contents_activityView.validateSuccess((Contents_Result) response.body().getResult());
                Log.d("ㅠㅠ","서비스 성공");
                return;
            }

            @Override
            public void onFailure(Call<Contents_Response> call, Throwable t) {
                contents_activityView.validateFailure(null);
                System.out.println(t.getMessage());
                System.out.println("");
            }



        });
    }
}
