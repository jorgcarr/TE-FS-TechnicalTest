package com.te.movies.demo.repository;

import com.te.movies.demo.entities.Movie;
import com.te.movies.demo.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql(scripts = {"/cleanup.sql", "/data.sql"})
public class IntegrationTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void testFindAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        assertThat(movies).hasSize(15);
    }
}