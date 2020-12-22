package com.softsquared.template.src.Fragment_recommended_complete.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WebtoonRecommendedResult {




        @SerializedName("webtoonIdx")
        @Expose
        private  int webtoonIdx;

        @SerializedName("thumbnailUrl")
        @Expose
        private String thumbnailUrl;

        @SerializedName("title")
        @Expose
        private String title;

        @SerializedName("creator")
        @Expose
        private String creator;

        @SerializedName("star")
        @Expose
        private  float star;

        @SerializedName("up")
        @Expose
        private String up;

        @SerializedName("new")
        @Expose
        private String new_;

        @SerializedName("viewType")
        @Expose
        private String viewType;

        @SerializedName("adult")
        @Expose
        private  String adult;

        @SerializedName("rest")
        @Expose
        private  String rest;

        public int getWebtoonIdx() {
            return webtoonIdx;
        }

        public void setWebtoonIdx(int webtoonIdx) {
            this.webtoonIdx = webtoonIdx;
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

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public float getStar() {
            return star;
        }

        public void setStar(float star) {
            this.star = star;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getNew_() {
            return new_;
        }

        public void setNew_(String new_) {
            this.new_ = new_;
        }

        public String getViewType() {
            return viewType;
        }

        public void setViewType(String viewType) {
            this.viewType = viewType;
        }

        public String getAdult() {
            return adult;
        }

        public void setAdult(String adult) {
            this.adult = adult;
        }

        public String getRest() {
            return rest;
        }

        public void setRest(String rest) {
            this.rest = rest;
        }
}
