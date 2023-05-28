package com.example.project4.sirvecs;

import com.example.project4.ApiException.ApiExption;
import com.example.project4.MODEL.Director;
import com.example.project4.MODEL.Movie;
import com.example.project4.Repostry.MovieRepostry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServic {
    private final MovieRepostry movieRepostry;


    public List<Movie> getAllMovie(){
        return movieRepostry.findAll();
    }

    public void addmovi(Movie movie){
        movieRepostry.save(movie);
    }
    public Boolean updateCoffee(Integer id , Movie movie){
        Movie movie1=movieRepostry.findAll(id);
        if (movie1==null){
            return false;
        }
        //اعدل على البيانات اللي ابيها عن طريق الاوبجت الجديد واستدعي القديم
        movie1.setName(movie.getName());

        movieRepostry.save(movie1);
        return true;
    }
    public Movie deleteMovi(Integer id ) {
        Movie movie=movieRepostry.deleteAll();
        if (movie == null) {
            throw new ApiExption("try agien");
        }
        return movie;
    }
public Movie getByName(String duration){
        Movie movie=movieRepostry.findMovieByName(duration);
        return movie;

}
    public Movie getByName(String dirctor) {
        Movie movie = movieRepostry.findMovieByName(dirctor);
        return movie;
    }
    public List<Movie> getByname(String name) {
        List<Movie> movies = movieRepostry.getMovieByID_Director(name);
        if (name == null) {
            throw new ApiExption("not found");
        }
        return movies;
    }
    public List<Movie> getByRating(Integer rating) {
        List<Movie> movies = movieRepostry.getMovieByRating(rating);
        if (rating == null) {
            throw new ApiExption("not found");
        }
        return movies;
    }
    public List<Movie> getAllByGenre(Integer genre) {
        List<Movie> movies = movieRepostry.getMovieByRating(genre);
        if (genre == null) {
            throw new ApiExption("not found");
        }
        return movies;
    }

}
