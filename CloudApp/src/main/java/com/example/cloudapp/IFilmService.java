package com.example.cloudapp;

import java.util.Collection;

public interface IFilmService {
    Collection<Film> findAll();
    Film create(Film film) throws Exception;
}
