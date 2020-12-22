package com.softsquared.template.src.Fragment_webtoon_contents.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;
import com.softsquared.template.src.Fragment_webtoon.s.models.Result;

import java.util.List;

public class Contents_Response {

    @SerializedName("result")
    @Expose
    private List<Contents_Result> result = null;
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;

    public List<Contents_Result> getResult() {
        return result;
    }

    public void setResult(List<Contents_Result> result) {
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
