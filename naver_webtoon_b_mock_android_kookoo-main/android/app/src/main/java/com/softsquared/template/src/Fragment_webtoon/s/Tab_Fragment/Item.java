package com.softsquared.template.src.Fragment_webtoon.s.Tab_Fragment;

public class Item {
    String thumbnail;
    String title;
    String star;
    String writer;

    public Item(String thumbnail, String title, float star, String writer) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.star = Integer.toString((int) star);
        this.writer = writer;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getStar() {
        return star;
    }

    public String getWriter() {
        return writer;
    }
}
