package com.softsquared.template.src.Fragment_recommended_complete.interfaces;


import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;

import java.util.List;

public interface Webtoon_Recommdned_ActivityView {

    void validateSuccess(List<WebtoonList> results);

    void validateFailure(String message);
}
