package com.te.movies.demo.repository;

import com.te.movies.demo.entities.Actor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {

}