package com.te.movies.demo.controller;

import com.te.movies.demo.entities.Author;
import com.te.movies.demo.entities.Genre;
import com.te.movies.demo.entities.Movie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Sql(scripts = {"/cleanup.sql", "/data.sql"})
public class MovieControllerIntegrationTest {


    private static String BASE_URL = "http://localhost:";
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    public String getBaseUrl() {
        return BASE_URL + port;
    }
    @Test
    public void testGetAllMovies() {
        String response = this.restTemplate.getForObject(getBaseUrl() + "/movies",
                String.class);
        System.out.println(response);
        assertThat(response).isNotEmpty();

    }

    @Test
    public void testGetMovieById() {

        Movie movie = restTemplate.getForObject(getBaseUrl() + "/movies/1", Movie.class);
        assertThat(movie.getTitle()).isEqualTo("Inception");
    }

}