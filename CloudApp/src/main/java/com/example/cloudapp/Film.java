package com.example.cloudapp;

import javax.persistence.*;

@Entity
@Table(name = "sv_7_2021")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(nullable = false, name = "title")
    private String title;
    @Column(nullable = false, name = "genre")
    private String genre;
    @Column(nullable = false, name = "year")
    private Long year;

    public Film() {
        this.id = null;
        this.title = "";
        this.genre = "";
        this.year = 0L;
    }

    public Film(Long id, String title, String genre, Long year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }
}