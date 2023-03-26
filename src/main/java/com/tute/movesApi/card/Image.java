package com.tute.movesApi.card;

import jakarta.persistence.*;

@Entity
@Table(name="images")
public class Image {
    private int user_id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String path;
    public Image(){}

    public Image(int user_id, int id, String path) {
        this.user_id = user_id;
        this.id = id;
        this.path = path;
    }
    public int getuser_id() {
        return user_id;
    }
    public void setuser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
}
