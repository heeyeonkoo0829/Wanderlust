package com.softsquared.template.src.Fragment_webtoon.s.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DetailResult {

    @SerializedName("thumbnailUrl")
    @Expose
    private  String thumbnailUrl;

    @SerializedName("color")
    @Expose
    private String color;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("creator")
    @Expose
    private String creator;

    @SerializedName("week")
    @Expose
    private  String week;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("isInterested")
    @Expose
    private String isInterested;

    @SerializedName("notice")
    @Expose
    private String notice;

    @SerializedName("episode")
    @Expose
   private List<DetailResult_2> episode =null;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIsInterested() {
        return isInterested;
    }

    public void setIsInterested(String isInterested) {
        this.isInterested = isInterested;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public List<DetailResult_2> getEpisode() {
        return episode;
    }

    public void setEpisode(List<DetailResult_2> episode) {
        this.episode = episode;
    }
}
