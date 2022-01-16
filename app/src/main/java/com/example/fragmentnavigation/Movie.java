package com.example.fragmentnavigation;

public class Movie {
    private String title;
    private String price;
    private int image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Movie(String title, String price, int image) {
        this.title = title;
        this.price = price;
        this.image = image;
    }
}
