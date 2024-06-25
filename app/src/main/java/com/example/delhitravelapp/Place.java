package com.example.delhitravelapp;

public class Place {

    private String name;
    private String daysOpen;
    private int imageRes;

    public Place(String name, String daysOpen, int imageRes) {
        this.name = name;
        this.daysOpen = daysOpen;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public String getDaysOpen() {
        return daysOpen;
    }

    public int getImageRes() {
        return imageRes;
    }
}
