package com.example.project4.Repostry;

import com.example.project4.MODEL.Director;
import com.example.project4.MODEL.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepostry extends JpaRepository<Movie, Integer> {

Movie findPleaseGetAllId(Integer id);

    @Query("select name from Movie WHERE name=?")
    List<Movie> getMovieByName(String  name);


    Movie findMovieByName(Integer duration);

    Movie findMovieByName(String name);

    @Query("SELECT name from Movie where name=?")
    List<Movie>getMovieByID_Director(String name);

    @Query("SELECT rating from Movie where rating=?")
    List<Movie>getMovieByRating(Integer Ratring);

    @Query("SELECT rating from Movie where rating>4")
    List<Movie>getAllByRating(Integer rate);

    @Query("SELECT genre from Movie where genre='drama'")
    List<Movie>getAllMovieByGenre(String genre);

}

