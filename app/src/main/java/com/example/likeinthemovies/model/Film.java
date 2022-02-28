package com.example.likeinthemovies.model;

import java.util.List;

public class Film {
    String years;
    List<Flame> flameList;
    int posterLink;
    int id;
    String title;

    public Film(int id, String title, String years, int posterLink) {
        this.id = id;
        this.title = title;
        this.years = years;
       //this.flameList = flameList;
        this.posterLink = posterLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public List<Flame> getFlameList() {
        return flameList;
    }

    public void setFlameList(List<Flame> flameList) {
        this.flameList = flameList;
    }

    public int getPosterLink() {
        return posterLink;
    }

    public void setPosterLink(int posterLink) {
        this.posterLink = posterLink;
    }


    public class Flame {
        String flameName;
        String flameMapLink;
    }
}
