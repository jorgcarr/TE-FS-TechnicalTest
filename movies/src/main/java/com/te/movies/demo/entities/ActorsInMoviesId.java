package com.te.movies.demo.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class ActorsInMoviesId implements Serializable {
    private Long movieId;
    private Long actorId;
}