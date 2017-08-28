package com.example.memy.controller;

import com.example.memy.ArticleDao.ArticleDao;
import com.example.memy.ArticleDao.ArticleDaoImp;
import com.example.memy.Model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ArticleController {

    private ArticleDao articleDao = new ArticleDaoImp();

    @GetMapping("/articles")
    public String article(ModelMap modelMap){
        modelMap.addAttribute("articles", articleDao.findAll());
        return "articles";
    }
}
