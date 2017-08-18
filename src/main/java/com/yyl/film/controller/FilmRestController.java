package com.yyl.film.controller;


import com.yyl.film.entity.FilmLocations;
import com.yyl.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xchunzhao on 02/05/2017.
 */
@RestController
public class FilmRestController {


    @Autowired
    private FilmService filmService;


    @RequestMapping(value = "/api/getAllFilm", method = RequestMethod.GET)
    public List<FilmLocations> findAllFilm(){
        return filmService.selectAll();
    }


    @RequestMapping(value = "/api/getFilmByName", method = RequestMethod.GET)
    public List<FilmLocations> findByName(@RequestParam(value = "name") String name){
        return filmService.selctByName(name);
    }



}
