package com.mmall.util;

import java.util.Objects;

public class CartInfo {
    private Integer cid;
    private Integer uid;
    private Integer pid;
    private Integer price;
    private String title;
    private String description;
    private  String image;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartInfo)) return false;
        CartInfo cartInfo = (CartInfo) o;
        return Objects.equals(getCid(), cartInfo.getCid()) && Objects.equals(getUid(), cartInfo.getUid()) && Objects.equals(getPid(), cartInfo.getPid()) && Objects.equals(getPrice(), cartInfo.getPrice()) && Objects.equals(getTitle(), cartInfo.getTitle()) && Objects.equals(getDescription(), cartInfo.getDescription()) && Objects.equals(getImage(), cartInfo.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCid(), getUid(), getPid(), getPrice(), getTitle(), getDescription(), getImage());
    }

    @Override
    public String toString() {
        return "CartInfo{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
