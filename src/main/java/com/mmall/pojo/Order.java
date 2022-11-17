package com.mmall.pojo;

import java.util.Objects;

public class Order {
    private Integer oid;
    private Integer uid;
    private Integer pid;
    private Integer price;
    private String state;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(getOid(), order.getOid()) && Objects.equals(getUid(), order.getUid()) && Objects.equals(getPid(), order.getPid()) && Objects.equals(getPrice(), order.getPrice()) && Objects.equals(getState(), order.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getUid(), getPid(), getPrice(), getState());
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }
}
