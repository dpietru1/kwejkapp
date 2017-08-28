package com.example.memy.ArticleDao;

import com.example.memy.Model.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImp implements ArticleDao {

    private static List<Article> articles = new ArrayList<>();
    static {
        articles.add(new Article(1,"Articul1","OpisOpisOpis"));
        articles.add(new Article(2,"Articul2","OpisOpisOpis"));
        articles.add(new Article(3,"Articul3","OpisOpisOpis"));
        articles.add(new Article(4,"Articul4","OpisOpisOpis"));
        articles.add(new Article(5,"Articul5","OpisOpisOpis"));
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }
}
