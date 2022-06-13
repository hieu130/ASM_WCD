package com.example.assignment_wcd.entity;

import com.example.assignment_wcd.entity.base.BaseEntity;

import java.time.LocalDateTime;

public class Food extends BaseEntity {
    private int id;
    private String nameFood;
    private Category Categoryid;
    private String description;
    private String avatar;
    private String price;
    private LocalDateTime startDate;

    public Food(int id, String nameFood, Category categoryid, String description, String avatar, String price, LocalDateTime startDate) {
        this.id = id;
        this.nameFood = nameFood;
        Categoryid = categoryid;
        this.description = description;
        this.avatar = avatar;
        this.price = price;
        this.startDate = startDate;
    }

    public Food() {
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

    public Category getCategoryid() {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
}
