package com.softsquared.template.src.Fragment_recommended_complete.top10;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;

import java.util.List;

public class Webtoon_Recommended_top10_Response {
    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("webtoonList")
    @Expose
    private List<webtoonList> webtoonList = null;
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<webtoonList> getwebtoonList() {
        return webtoonList;
    }


    public void setWebtoonList(List<webtoonList> webtoonList) {
        this.webtoonList = webtoonList;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
