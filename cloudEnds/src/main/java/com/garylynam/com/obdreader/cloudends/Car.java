package com.garylynam.com.obdreader.cloudends;

/**
 * Created by GaryPC on 05/02/2015.
 */
public class Car {

    String serial;
    String color;
    String make;
    String model;
    int year;

    public Car(String serial, String color, String make, String model, int year) {
        this.serial = serial;
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car() {
        this.color = "Red";
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSerial() {

        return serial;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
