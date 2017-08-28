package com.example.memy.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 02.08.2017.
 */
public class Category {

    private Long id;
    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " "+name;
    }
}
