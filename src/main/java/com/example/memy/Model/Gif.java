package com.example.memy.Model;

import java.awt.*;

/**
 * Created by slickender on 02.08.2017.
 */
public class Gif {

    private String name;
    private boolean favorite;
    private String userName;
    private Category category;

    public String getUserName() {
        return userName;
    }

    public Gif(String name, boolean favorite, String userName, Category category) {
        this.name = name;
        this.favorite = favorite;
        this.userName = userName;
        this.category = category;
    }

    public Gif(String name, boolean favorite, String userName) {
        this.name = name;
        this.favorite = favorite;
        this.userName = userName;
    }
    public Gif() {
    }

    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public Gif(String name, boolean favorite, Category category) {
        this.name = name;
        this.favorite = favorite;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        favorite = favorite;
    }
}
