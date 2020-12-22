package com.softsquared.template.src.Fragment_webtoon_contents.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.softsquared.template.src.Fragment_webtoon.s.models.DetailResult_2;

import java.util.List;

public class Contents_Result
{

    @SerializedName("episodeIdx")
    @Expose
    private int episodeIdx;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("heartCount")
    @Expose
    private int heartCount;

    @SerializedName("heartStatus")
    @Expose
    private int heartStatus;

    @SerializedName("commentCount")
    @Expose
    private int commentCount;

    @SerializedName("contents")
    @Expose
    private List<Contents_ContentsUrl> contents_url =null;


    public int getEpisodeIdx() {
        return episodeIdx;
    }

    public void setEpisodeIdx(int episodeIdx) {
        this.episodeIdx = episodeIdx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHeartCount() {
        return heartCount;
    }

    public void setHeartCount(int heartCount) {
        this.heartCount = heartCount;
    }

    public int getHeartStatus() {
        return heartStatus;
    }

    public void setHeartStatus(int heartStatus) {
        this.heartStatus = heartStatus;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public List<Contents_ContentsUrl> getContents_url() {
        return contents_url;
    }

    public void setContents_url(List<Contents_ContentsUrl> contents_url) {
        this.contents_url = contents_url;
    }
}
