package com.example.assignment_wcd.entity;

public class Category {
    private int id;
    private String Name;
    private String Status;

    public Category(int id, String name, String status) {
        this.id = id;
        Name = name;
        Status = status;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
