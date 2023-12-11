package com.example.apphoteles;

public class Hotel {
    private String name;
    private int imageResourceId;
    private String location;

    public Hotel(String name, int imageResourceId, String location) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }




}
