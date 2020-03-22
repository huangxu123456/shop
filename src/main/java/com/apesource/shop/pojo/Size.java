package com.apesource.shop.pojo;

import java.io.Serializable;

public class Size implements Serializable {

    private int sid;
    private String sname;
    private int dec;
    private int mid;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Size(int id, String name, int dec, int mid) {
        this.sid = id;
        this.sname = name;
        this.dec = dec;
        this.mid = mid;
    }

    public Size() {
    }

    public Size(int id, String name, int dec) {
        this.sid = id;
        this.sname = name;
        this.dec = dec;
    }

    public int getId() {
        return sid;
    }

    public void setId(int id) {
        this.sid = id;
    }

    public String getName() {
        return sname;
    }

    public void setName(String name) {
        this.sname = name;
    }

    public int getDec() {
        return dec;
    }

    public void setDec(int dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return "Size{" +
                "id=" + sid +
                ", name='" + sname + '\'' +
                ", dec=" + dec +
                ", mid=" + mid +
                '}';
    }
}
