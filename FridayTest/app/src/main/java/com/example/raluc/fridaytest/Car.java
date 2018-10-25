package com.example.raluc.fridaytest;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model, type, year;
     static List<Car> cars = new ArrayList<>();


    public Car(String model, String type, String year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar (Car car){
        cars.add(car);
    }
}
