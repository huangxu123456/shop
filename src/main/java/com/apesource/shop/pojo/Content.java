package com.apesource.shop.pojo;

import java.io.Serializable;
import java.util.List;

public class Content implements Serializable{
    private int id;
    
    private int categoryId;
    private String title;
    private String url;
    private String pic;
    private int status1;
    private int sortOrder;
    private ContentCategory contentCategory;
    private List<Content>  contents;

    public Content() {
    }

    public Content(int id, int categoryId, String title, String url, String pic, int status1, int sortOrder, ContentCategory contentCategory, List<Content> contents) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.url = url;
        this.pic = pic;
        this.status1 = status1;
        this.sortOrder = sortOrder;
        this.contentCategory = contentCategory;
        this.contents = contents;
    }

    public Content(int id, int categoryId, String title, String url, String pic, int status1, int sortOrder, ContentCategory contentCategory) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.url = url;
        this.pic = pic;
        this.status1 = status1;
        this.sortOrder = sortOrder;
        this.contentCategory = contentCategory;
    }

    public Content(int id, int categoryId, String title, String url, String pic, int status1, int sortOrder) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.url = url;
        this.pic = pic;
        this.status1 = status1;
        this.sortOrder = sortOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getStatus1() {
        return status1;
    }

    public void setStatus1(int status1) {
        this.status1 = status1;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public ContentCategory getContentCategory() {
        return contentCategory;
    }

    public void setContentCategory(ContentCategory contentCategory) {
        this.contentCategory = contentCategory;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", pic='" + pic + '\'' +
                ", status1=" + status1 +
                ", sortOrder=" + sortOrder +
                ", contentCategory=" + contentCategory +
                ", contents=" + contents +
                '}';
    }
}
