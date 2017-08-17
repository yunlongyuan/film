package com.yyl.film.mapper;

import com.yyl.film.entity.FilmLocations;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FilmLocationsMapper {
    @Select("SELECT * FROM film_locations")
    @Results({
            @Result(property = "title",  column = "Title"),
            @Result(property = "releaseYear", column = "ReleaseYear"),
            @Result(property = "locations", column = "Locations"),
            @Result(property = "funFacts", column = "Fun Facts"),
            @Result(property = "productionCompany", column = "Production Company"),
            @Result(property = "distributor", column = "Distributor"),
            @Result(property = "director", column = "Director"),
            @Result(property = "writer", column = "Writer"),
            @Result(property = "actor1", column = "Actor1"),
            @Result(property = "actor2", column = "Actor2"),
            @Result(property = "actor3", column = "Actor3")
    })
    List<FilmLocations> selectAll();

    @Select("SELECT * FROM film_locations where title=#{title}")
    @Results({
            @Result(property = "title",  column = "Title"),
            @Result(property = "releaseYear", column = "ReleaseYear"),
            @Result(property = "locations", column = "Locations"),
            @Result(property = "funFacts", column = "Fun Facts"),
            @Result(property = "productionCompany", column = "Production Company"),
            @Result(property = "distributor", column = "Distributor"),
            @Result(property = "director", column = "Director"),
            @Result(property = "writer", column = "Writer"),
            @Result(property = "actor1", column = "Actor1"),
            @Result(property = "actor2", column = "Actor2"),
            @Result(property = "actor3", column = "Actor3")
    })
    List<FilmLocations> selectByFilmName(@Param("title") String title);
}