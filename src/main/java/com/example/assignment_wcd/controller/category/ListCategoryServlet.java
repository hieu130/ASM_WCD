package com.example.assignment_wcd.controller.category;

import com.example.assignment_wcd.model.CategoryModel;
import com.example.assignment_wcd.model.MySqlCategoryModel;
import org.jboss.weld.environment.logging.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categoryList = categoryModel.findByAll();
        req.setAttribute("categoryList", categoryList);
        req.getRequestDispatcher("").forward(req, resp);
    }
}
