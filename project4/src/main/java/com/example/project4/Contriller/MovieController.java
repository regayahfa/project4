package com.example.project4.Contriller;

import com.example.project4.MODEL.Director;
import com.example.project4.MODEL.Movie;
import com.example.project4.sirvecs.MovieServic;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieServic movieServic;

    @GetMapping("/get")
    public ResponseEntity getAllmovies() {
        List<Movie> movie = movieServic.getAllMovie();
        return ResponseEntity.status(200).body("great");
    }

    @PostMapping("/add")
    public ResponseEntity addmovu(@Valid @RequestBody Movie movie) {
        movieServic.save();
        return ResponseEntity.status(200).body("coffee added");
    }

    @PostMapping("/Update")
    public ResponseEntity updatemovi(@Valid @RequestBody Movie movie, @PathVariable Integer id) {
        boolean isupdated = movieServic.updatemovis();
        return ResponseEntity.status(200).body("updated");
    }

    @DeleteMapping("/delete/{ID}")
    public ResponseEntity deleteCoffee(@PathVariable Integer ID) {
        Movie movie = movieServic.deletemovis();
        return ResponseEntity.status(200).body("great");
    }

    @GetMapping("/get-name")
    public Movie getByName(String name) {
        Movie movie = movieServic.getAllMovie();
        return movie;
    }
    @GetMapping("/get-name-duration")
public Movie getByName(Integer duration){
        Movie movie=movieServic.getByName(duration);
        return movie;
}
    @GetMapping("/get-name-dirctor")
    public Movie getByName(String dirctor){
        Movie movie=movieServic.getByName(dirctor);
        return movie;
    }
    @GetMapping("/get-dirctor")
    public ResponseEntity getByName(@Valid @RequestBody String NAME){
        List<Movie>movies=movieServic.getByName(Director);
        return ResponseEntity.status(200).body(NAME);
    }
    @GetMapping("/get-rating")
    public ResponseEntity getByRatring(@PathVariable Integer Ratring){
        List<Movie>movies=movieServic.getByRating(Ratring);
        return ResponseEntity.status(200).body(Ratring);
    }
    @GetMapping("/get-rating")
    public ResponseEntity getByGenre(@PathVariable Integer genre){
        List<Movie>movies= movieServic.getAllMovie();
        return ResponseEntity.status(200).body(genre);
    }


}
