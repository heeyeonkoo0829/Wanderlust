package com.softsquared.template.src.Fragment_webtoon.s.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetailResult_2 {

    @SerializedName("episodeIdx")
    @Expose
    private  String episodeIdx;

    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("up")
    @Expose
    private String upl;

    @SerializedName("star")
    @Expose
    private String star;

    @SerializedName("updatedDate")
    @Expose
    private String updatedDate;

    @SerializedName("music")
    @Expose
    private String music;


    @SerializedName("isSaved")
    @Expose
    private String isSaved;

    @SerializedName("isSaw")
    @Expose
    private String isSaw;

    public String getEpisodeIdx() {
        return episodeIdx;
    }

    public void setEpisodeIdx(String episodeIdx) {
        this.episodeIdx = episodeIdx;
    }

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

    public String getUpl() {
        return upl;
    }

    public void setUpl(String upl) {
        this.upl = upl;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(String isSaved) {
        this.isSaved = isSaved;
    }

    public String getIsSaw() {
        return isSaw;
    }

    public void setIsSaw(String isSaw) {
        this.isSaw = isSaw;
    }
}
