package com.apesource.shop.pojo;

import java.io.Serializable;

public class Brand  implements Serializable{

    private int id;
    private String name;
    private String firstName;
    private int  page;
    private int pagesize;

    public Brand() {
    }

    public Brand(int id, String name, String firstName, int page, int pagesize) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.page = page;
        this.pagesize = pagesize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public Brand(int id, String name, String firstName) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", page=" + page +
                ", pagesize=" + pagesize +
                '}';
    }
}
