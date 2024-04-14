package com.example.cloudapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IFilmRepository extends JpaRepository<Film, Long> {

}
