package com.example.filimo;

public class ModelMovieVizhe {
    private int id;
    private String image;
    private String title;

    public ModelMovieVizhe(int id, String image, String title) {
        this.id = id;
        this.image = image;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
