package com.softsquared.template.src.Fragment_webtoon.s.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.softsquared.template.src.Fragment_webtoon.s.models.Result;

import java.util.List;

public class DetailResponse {

    @SerializedName("result")
    @Expose
    private DetailResult result;
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("code")
    @Expose
    private Integer code;

    @SerializedName("message")
    @Expose
    private String message;

    public DetailResult getResult() {
        return result;
    }

    public void setResult(DetailResult result) {
        this.result = result;
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
