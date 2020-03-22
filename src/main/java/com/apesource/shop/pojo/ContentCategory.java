package com.apesource.shop.pojo;

import java.io.Serializable;
import java.util.List;

public class ContentCategory implements Serializable{

    private int id;
    private String name;
    private int state;
    private List<ContentCategory> contentCategories;

    public ContentCategory() {
    }

    public ContentCategory(int id, String name, int state, List<ContentCategory> contentCategories) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.contentCategories = contentCategories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<ContentCategory> getContentCategories() {
        return contentCategories;
    }

    public void setContentCategories(List<ContentCategory> contentCategories) {
        this.contentCategories = contentCategories;
    }

    @Override
    public String toString() {
        return "ContentCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", contentCategories=" + contentCategories +
                '}';
    }
}
