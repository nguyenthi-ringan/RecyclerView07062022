package com.example.recyclerview07062022;

import java.security.Provider;
import java.util.List;

public class Food {
    private int image;
    private String name;
    private String address;
    private List<ServiceKind> serviceKindList;
    private String discount;
    private float distance;
    private float openTime;
    private float closeTime;

    public Food() { }

    public Food(int image, String name, String address, List<ServiceKind> serviceKindList, String discount, float distance, float openTime, float closeTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.serviceKindList = serviceKindList;
        this.discount = discount;
        this.distance = distance;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ServiceKind> getServiceKindList() {
        return serviceKindList;
    }

    public void setServiceKindList(List<ServiceKind> serviceKindList) {
        this.serviceKindList = serviceKindList;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getOpenTime() {
        return openTime;
    }

    public void setOpenTime(float openTime) {
        this.openTime = openTime;
    }

    public float getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(float closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        return "Food{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", serviceKindList=" + serviceKindList +
                ", discount='" + discount + '\'' +
                ", distance=" + distance +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                '}';
    }
}

