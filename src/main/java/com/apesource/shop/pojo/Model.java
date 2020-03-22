package com.apesource.shop.pojo;


import java.io.Serializable;
import java.util.List;

public class Model implements Serializable{
     private int id;
     private String name;
     private int page;
     private int pagesize;
     private List<Size> sizes;

    public Model() {
    }

    public Model(int id, String name, int page, int pagesize, List<Size> sizes) {
        this.id = id;
        this.name = name;
        this.page = page;
        this.pagesize = pagesize;
        this.sizes = sizes;
    }

    public Model(int id, String name, List<Size> sizes) {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
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

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", page=" + page +
                ", pagesize=" + pagesize +
                ", sizes=" + sizes +
                '}';
    }
}
