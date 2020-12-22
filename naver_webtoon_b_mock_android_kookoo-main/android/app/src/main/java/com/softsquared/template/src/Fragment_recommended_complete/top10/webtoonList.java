package com.softsquared.template.src.Fragment_recommended_complete.top10;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class webtoonList {

    @SerializedName("ranking")
    @Expose
    private int ranking;

    @SerializedName("webtoonIdx")
    @Expose
    private int webtoonIdx;


    @SerializedName("title")
    @Expose
    private  String title;

    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;

    @SerializedName("creator")
    @Expose
    private String creator;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
