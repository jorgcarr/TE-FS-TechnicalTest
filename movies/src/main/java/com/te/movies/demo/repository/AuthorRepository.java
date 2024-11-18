package com.te.movies.demo.repository;

import com.te.movies.demo.entities.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}