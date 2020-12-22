package com.softsquared.template.src.Fragment_webtoon_contents.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contents_ContentsUrl {

    @SerializedName("contentsUrl")
    @Expose
    private String contentsUrl;

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }
}
