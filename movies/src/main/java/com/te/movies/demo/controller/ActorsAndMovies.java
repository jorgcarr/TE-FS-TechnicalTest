package com.te.movies.demo.controller;

import com.te.movies.demo.entities.ActorsInMovies;
import com.te.movies.demo.repository.ActorInMovieRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ActorsAndMovies {

    private final ActorInMovieRepository actorInMovieRepository;

    @GetMapping("/movies/{movieId}/actors")
    public List<ActorsInMovies> getActorsAndMovie(@PathVariable Long movieId) {
        //Return the actors in the movie using the actorInMovieRepository
        return actorInMovieRepository.findByMovieId(movieId);

    }

    @PostMapping("/actorsinmovies")
    public ActorsInMovies addActorToMovie(@RequestBody ActorsInMovies actorsInMovies) {
        //Add an actor to a movie using the actorInMovieRepository
        return actorInMovieRepository.save(actorsInMovies);
    }
}
