package com.tute.movesApi.card;
import jakarta.persistence.*;
import java.util.ArrayList;
@Entity
@Table(name="movies_info")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Title;
    private String Year;
    private String ImdbRating;
    private String Runtime;
    private String Type;
    private String Writer;
    private String Actors;
    private String Director;
    public Card()
    {

    }
    public Card(int id, String title, String year, String imdbRating, String runtime, String type, String writer, String actors, String director) {
        super();
        Title = title;
        Year = year;
        ImdbRating = imdbRating;
        Runtime = runtime;
        Type = type;
        Writer = writer;
        Actors = actors;
        Director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getImdbRating() {
        return ImdbRating;
    }

    public void setImdbRating(String imdbRating) {
        ImdbRating = imdbRating;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }
}
