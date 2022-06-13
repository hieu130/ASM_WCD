package com.example.assignment_wcd.controller.food;

import com.example.assignment_wcd.entity.Food;
import com.example.assignment_wcd.model.FoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateFoodServlet extends HttpServlet {
    private FoodModel foodModel;

    @Override
    public void init() throws ServletException {
        foodModel = new MySqlFoodModelimplements();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String namefood = req.getParameter("namefood");
        String Categoryid = req.getParameter("Categoryid");
        String description = req.getParameter("description");
        String avatar = req.getParameter("avatar");
        Double price = Double.parseDouble(req.getParameter("price"));
        Food food = new Food(namefood,Categoryid,description,avatar,price);
        req.setAttribute("food", food);
        req.getRequestDispatcher("").forward(req, resp);
    }
}
