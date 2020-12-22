package com.softsquared.template.src.Fragment_my;

import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_ActivityView;
import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_Response;
import com.softsquared.template.src.Fragment_recommended_complete.top10.Webtoon_Recommended_top10_Retrofitinterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Headers;

import static com.softsquared.template.src.main.ApplicationClass.getRetrofit;

public class Tab_Interested_Service {
    private final Tab_Interested_ActivityView tab_interested_activityView;

    public Tab_Interested_Service(Tab_Interested_ActivityView tab_interested_activityView) {
        this.tab_interested_activityView= tab_interested_activityView;
    }

    public void get_interested() {
        final Tab_Interested_RetrofitInterface boxOfifceRetrofitInterface = getRetrofit().create(Tab_Interested_RetrofitInterface.class);
        boxOfifceRetrofitInterface.get_interested().enqueue(new Callback<Tab_Interested_Response>() {
            @Override
            public void onResponse(Call<Tab_Interested_Response> call, Response<Tab_Interested_Response> response) {
                final Tab_Interested_Response tab_interested_response = response.body();
                if (tab_interested_response == null) {
                   tab_interested_activityView.validateFailure(null);
                    return;
                }
                tab_interested_activityView.validateSuccess(response.body().getinterested());

                System.out.println("d");
                return;
            }


            @Override
            public void onFailure(Call<Tab_Interested_Response> call, Throwable t) {
                tab_interested_activityView.validateFailure(null);
                System.out.println(t.getMessage());
                System.out.println("");
            }

        });
    }
}
