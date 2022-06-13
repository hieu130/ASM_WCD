package com.example.assignment_wcd.entity;

import com.example.assignment_wcd.entity.base.BaseEntity;
import com.example.assignment_wcd.entity.myenum.CategoryStatus;

import java.time.LocalDateTime;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private CategoryStatus status;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    public LocalDateTime deletedAt;
    public int createdBy;
    public int updatedBy;
    public int deletedBy;

    public Category(String name) {
        this.id = id;
        this.name = this.name;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.deletedBy = deletedBy;
    }

    public Category(int id, String name) {
    }

    public Category(int id, String name, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, CategoryStatus categoryStatus) {
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

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    @Override
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public int getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public int getDeletedBy() {
        return deletedBy;
    }

    @Override
    public void setDeletedBy(int deletedBy) {
        this.deletedBy = deletedBy;
}
