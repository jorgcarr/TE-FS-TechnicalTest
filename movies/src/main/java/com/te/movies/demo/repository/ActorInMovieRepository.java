package com.te.movies.demo.repository;

import com.te.movies.demo.entities.ActorsInMovies;
import com.te.movies.demo.entities.ActorsInMoviesId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorInMovieRepository extends JpaRepository<ActorsInMovies, ActorsInMoviesId> {

    @Query("SELECT a FROM ActorsInMovies a WHERE a.movie.id = :movieId")
    List<ActorsInMovies> findByMovieId(Long movieId);

}