package com.example.delhitravelapp;

public class PlaceDesc {

    String location;
    String Metro;
    String time;
    String fee;

    public String getLocation() {
        return location;
    }

    public String getMetro() {
        return Metro;
    }

    public String getTime() {
        return time;
    }

    public String getFee() {
        return fee;
    }

    public PlaceDesc(String location, String metro, String time, String fee) {
        this.location = location;
        Metro = metro;
        this.time = time;
        this.fee = fee;
    }
}
