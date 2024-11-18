package com.te.movies.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Table(name = "actors_in_movies")
@Data
@IdClass(ActorsInMoviesId.class)
public class ActorsInMovies {
    @Id
    @Column(name = "movie_id")
    private Long movieId;

    @Id
    @Column(name = "actor_id")
    private Long actorId;

    @Column(name = "role_name", nullable = false)
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "movie_id", insertable = false, updatable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "actor_id", insertable = false, updatable = false)
    private Actor actor;
}