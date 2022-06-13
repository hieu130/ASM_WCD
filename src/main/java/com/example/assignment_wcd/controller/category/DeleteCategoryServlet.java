package com.example.assignment_wcd.controller.category;

import com.example.assignment_wcd.entity.myenum.FoodStatus;
import com.example.assignment_wcd.model.CategoryModel;
import com.example.assignment_wcd.model.MySqlCategoryModel;
import org.jboss.weld.environment.logging.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class DeleteCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Category category = categoryModel.findById(id);
        category.setStatus(FoodStatus.DELETED);
        category.setDeletedAt(LocalDateTime.now());
        if(categoryModel.update(id, category)) {
            resp.sendRedirect("");
        }
    }
}
