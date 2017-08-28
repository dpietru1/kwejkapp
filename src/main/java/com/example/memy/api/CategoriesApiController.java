package com.example.memy.api;

import com.example.memy.ArticleDao.CategoryDaoImpl;
import com.example.memy.Model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesApiController {

    @GetMapping("/api/categories")
    public List<Category> listCategories(){
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        return categoryDao.findAll();
    }
}