package com.yyl.film.service.impl;

import com.yyl.film.entity.FilmLocations;
import com.yyl.film.mapper.FilmLocationsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yyl.film.service.FilmService;

import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmLocationsMapper filmLocationsMapper;
    @Override
    public List<FilmLocations> selectAll() {
        return filmLocationsMapper.selectAll();
    }

    @Override
    public List<FilmLocations> selctByName(String name) {
        return filmLocationsMapper.selectByFilmName(name);
    }
}
