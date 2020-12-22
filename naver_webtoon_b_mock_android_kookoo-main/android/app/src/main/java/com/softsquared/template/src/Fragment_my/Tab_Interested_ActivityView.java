package com.softsquared.template.src.Fragment_my;

import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;

import java.util.List;

public interface Tab_Interested_ActivityView {

    void validateSuccess(List<Interested_webtoonList> results);

    void validateFailure(String message);
}
