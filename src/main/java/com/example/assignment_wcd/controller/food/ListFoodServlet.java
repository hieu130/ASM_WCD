package com.example.assignment_wcd.controller.food;

import com.example.assignment_wcd.entity.Food;
import com.example.assignment_wcd.model.FoodModel;
import com.example.assignment_wcd.model.MySqlFoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListFoodServlet extends HttpServlet {
    private FoodModel foodModel;

    @Override
    public void init() throws ServletException {
        foodModel = new MySqlFoodModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Food> foodList = foodModel.findByAll();
        req.setAttribute("foodList", foodList);
        req.getRequestDispatcher("").forward(req, resp);
    }
}
