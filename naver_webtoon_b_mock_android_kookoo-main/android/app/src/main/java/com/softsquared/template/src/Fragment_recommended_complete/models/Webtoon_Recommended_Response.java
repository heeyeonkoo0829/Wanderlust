package com.softsquared.template.src.Fragment_recommended_complete.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Webtoon_Recommended_Response {
    @SerializedName("count")
    @Expose
    private String count;

    @SerializedName("webtoonList")
    @Expose
    private List<WebtoonList> webtoonList = null;
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<WebtoonList> getWebtoonList() {
        return webtoonList;
    }

    public void setWebtoonList(List<WebtoonList> webtoonList) {
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
