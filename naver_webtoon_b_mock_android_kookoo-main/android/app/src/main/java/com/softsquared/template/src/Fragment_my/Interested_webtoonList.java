package com.softsquared.template.src.Fragment_my;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Interested_webtoonList {



    @SerializedName("webtoonIdx")
    @Expose
    private int webtoonIdx;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;

    @SerializedName("upSign")
    @Expose
    private String upSign;

    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    public int getWebtoonIdx() {
        return webtoonIdx;
    }

    public void setWebtoonIdx(int webtoonIdx) {
        this.webtoonIdx = webtoonIdx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUpSign() {
        return upSign;
    }

    public void setUpSign(String upSign) {
        this.upSign = upSign;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
    }

    @SerializedName("isNotice")
    @Expose
    private String isNotice;
}
