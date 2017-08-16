package dao;

import bean.filmLocations;
import org.springframework.stereotype.Repository;

@Repository
public interface filmLocationsMapper {
    int insert(filmLocations record);

    int insertSelective(filmLocations record);
}