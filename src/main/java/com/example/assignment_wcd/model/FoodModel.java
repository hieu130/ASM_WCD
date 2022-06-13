package com.example.assignment_wcd.model;

import com.example.assignment_wcd.entity.Food;

import java.util.List;

public interface FoodModel {
    boolean save(Food food);
    boolean update(int id, Food food);
    boolean delete(int id);
    List<Food> findByAll();
    Food findById(int id);
    List<Food> findByAll(int id);

}
