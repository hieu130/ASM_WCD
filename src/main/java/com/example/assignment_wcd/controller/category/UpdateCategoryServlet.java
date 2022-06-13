package com.example.assignment_wcd.controller.category;

import com.example.assignment_wcd.model.CategoryModel;
import com.example.assignment_wcd.model.MySqlCategoryModel;
import org.jboss.weld.environment.logging.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Category category = categoryModel.findById(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("category", category);
        req.getRequestDispatcher("").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Category category = new Category(id,name);
        req.setAttribute("category", category);
        //req.setAttribute("errors");
        req.getRequestDispatcher("").forward(req, resp);
    }
}
