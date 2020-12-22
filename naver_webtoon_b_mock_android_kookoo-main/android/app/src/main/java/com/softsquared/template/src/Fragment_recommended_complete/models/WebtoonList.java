package com.softsquared.template.src.Fragment_recommended_complete.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WebtoonList {


    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("webtoonIdx")
    @Expose
    private int webtoonIdx;

    @SerializedName("creator")
    @Expose
    private  String creator;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("totalEpisode")
    @Expose
    private String totalEpisode;

    @SerializedName("adult")
    @Expose
    private String adult;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWebtoonIdx() {
        return webtoonIdx;
    }

    public void setWebtoonIdx(int webtoonIdx) {
        this.webtoonIdx = webtoonIdx;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTotalEpisode() {
        return totalEpisode;
    }

    public void setTotalEpisode(String totalEpisode) {
        this.totalEpisode = totalEpisode;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getEvery24() {
        return every24;
    }

    public void setEvery24(String every24) {
        this.every24 = every24;
    }

    @SerializedName("every24")
    @Expose
    private  String every24;


}
