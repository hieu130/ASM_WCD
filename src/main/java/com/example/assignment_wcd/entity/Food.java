package com.example.assignment_wcd.entity;

import com.example.assignment_wcd.entity.base.BaseEntity;
import com.example.assignment_wcd.entity.myenum.FoodStatus;

import java.time.LocalDateTime;

public class Food extends BaseEntity {
    private int id;
    private String nameFood;
    private Category Categoryid;
    private String description;
    private String avatar;
    private String price;

    public Food(int id, String nameFood, Category categoryid, String description, String avatar, String price) {
        this.id = id;
        this.nameFood = nameFood;
        Categoryid = categoryid;
        this.description = description;
        this.avatar = avatar;
        this.price = price;

    }

    public Food(String namefood, String categoryid, String description, String avatar, Double price) {
    }

    public Food(int id, String nameFood, String avatar, Double price, String description, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, FoodStatus foodStatus) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(Category categoryid) {
        Categoryid = categoryid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
