package com.example.assignment_wcd.model;

import com.example.assignment_wcd.entity.Food;

import java.util.List;

public interface FoolModel {
    boolean save(Food food);
    boolean update(int id, Food food);
    boolean delete(int id);
    Food findById(int id);
    List<Food> findAll();
}
