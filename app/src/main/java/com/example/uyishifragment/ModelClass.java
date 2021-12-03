package com.example.uyishifragment;

public class ModelClass {
    private String name;
    private String disc;
    private int Image;

    public ModelClass(String name, String disc, int image) {
        this.name = name;
        this.disc = disc;
        this.Image = image;
    }

    public String getName() {
        return name;
    }

    public String getDisc() {
        return disc;
    }

    public int getImage() {
        return Image;
    }
}
