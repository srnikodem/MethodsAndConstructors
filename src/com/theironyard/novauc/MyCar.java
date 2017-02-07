package com.theironyard.novauc;

/**
 * Created by christinekoufos old on 2/7/17.
 */
public class MyCar {
    String brand;
    String model;
    int year;
    String color;
    boolean coupe;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCoupe() {
        return coupe;
    }

    public void setCoupe(boolean coupe) {
        this.coupe = coupe;
    }

    public MyCar(String brand, String model, int year, String color, boolean coupe) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.coupe = coupe;
    }
}
