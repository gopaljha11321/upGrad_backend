package com.tute.movesApi.card;
import jakarta.persistence.*;
import java.util.ArrayList;
@Entity
@Table(name="movies_info")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String year;
    private String imdbRating;
    private String runtime;
    private String type;
    private String writer;
    private String actors;
    private String director;
    public Card()
    {

    }
    public Card(int id, String title, String year, String imdbRating, String runtime, String type, String writer, String actors, String director) {
        super();
        this.title = title;
        this.year = year;
        this.imdbRating = imdbRating;
        this.runtime = runtime;
        this.type = type;
        this.writer = writer;
        this.actors = actors;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
