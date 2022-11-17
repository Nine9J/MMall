package com.mmall.util;

import java.util.Objects;

public class AdminOrder {
    private Integer oid;
    private Integer uid;
    private Integer pid;
    private Integer price;
    private String state;
    private String title;
    private  String image;
    private String username;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminOrder)) return false;
        AdminOrder that = (AdminOrder) o;
        return Objects.equals(getOid(), that.getOid()) && Objects.equals(getUid(), that.getUid()) && Objects.equals(getPid(), that.getPid()) && Objects.equals(getPrice(), that.getPrice()) && Objects.equals(getState(), that.getState()) && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getImage(), that.getImage()) && Objects.equals(getUsername(), that.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getUid(), getPid(), getPrice(), getState(), getTitle(), getImage(), getUsername());
    }

    @Override
    public String toString() {
        return "AdminOrder{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
