package com.mmall.util;

import com.mmall.pojo.Order;

import java.util.Objects;

public class OrderInfo{
    private Integer oid;
    private Integer uid;
    private Integer pid;
    private Integer price;
    private String state;
    private String title;
    private String description;
    private  String image;

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
        if (!(o instanceof OrderInfo)) return false;
        OrderInfo orderInfo = (OrderInfo) o;
        return Objects.equals(getOid(), orderInfo.getOid()) && Objects.equals(getUid(), orderInfo.getUid()) && Objects.equals(getPid(), orderInfo.getPid()) && Objects.equals(getPrice(), orderInfo.getPrice()) && Objects.equals(getState(), orderInfo.getState()) && Objects.equals(getTitle(), orderInfo.getTitle()) && Objects.equals(getDescription(), orderInfo.getDescription()) && Objects.equals(getImage(), orderInfo.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getUid(), getPid(), getPrice(), getState(), getTitle(), getDescription(), getImage());
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
