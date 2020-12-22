package com.softsquared.template.src.Fragment_my;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.softsquared.template.src.Fragment_recommended_complete.models.WebtoonList;

import java.util.List;

public class Tab_Interested_Response {
    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("webtoonList")
    @Expose
    private List<Interested_webtoonList> interested_webtoonList = null;
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Interested_webtoonList> getinterested() {
        return interested_webtoonList;
    }

    public void setWebtoonList(List<Interested_webtoonList> webtoonList) {
        this.interested_webtoonList= webtoonList;
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

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;

}
