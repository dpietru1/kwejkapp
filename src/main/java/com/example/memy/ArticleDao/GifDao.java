package com.example.memy.ArticleDao;

import com.example.memy.Model.Gif;

import java.util.List;

/**
 * Created by slickender on 02.08.2017.
 */
public interface GifDao {

    List<Gif> allGifs();

    List<Gif> findFavourites();

    List<Gif> findByName(String name);

    List<Gif> gifsInCategory(Long id);

    List<Gif> gifsInCategory(String name);


}
