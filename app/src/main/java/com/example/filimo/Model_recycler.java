package com.example.filimo;

public class Model_recycler {

    private String image;
    private String title;

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

    public Model_recycler(String image, String title) {
        this.image = image;
        this.title = title;
    }

}
