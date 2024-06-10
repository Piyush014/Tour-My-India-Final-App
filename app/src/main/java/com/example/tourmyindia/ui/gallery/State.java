package com.example.tourmyindia.ui.gallery;

public class State {
    private String name;
    private int imageResId;

    public State(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
