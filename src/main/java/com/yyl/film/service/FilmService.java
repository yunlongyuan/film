package com.yyl.film.service;


import com.yyl.film.entity.FilmLocations;

import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */
public interface FilmService {


    public List<FilmLocations> selectAll();

    public List<FilmLocations> selctByName(String name);
}
