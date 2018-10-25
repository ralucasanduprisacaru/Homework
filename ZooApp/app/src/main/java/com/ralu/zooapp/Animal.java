package com.ralu.zooapp;

import android.media.MediaPlayer;

public class Animal {
    private String name, description, weight;
    private int resourceId;
    //private MediaPlayer mp;

    public Animal(String name, String description, String weight, int resourceId) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.resourceId = resourceId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
