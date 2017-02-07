package com.theironyard.novauc;

/**
 * Created by christinekoufos old on 2/7/17.
 */
public class House {
    String squareFootage;
    boolean gasHeat;
    boolean pool;
    int numberOfBedrooms;
    int numberOfBathrooms;

    public House(String squareFootage, boolean gasHeat, boolean pool, int numberOfBedrooms, int numberOfBathrooms) {
        this.squareFootage = squareFootage;
        this.gasHeat = gasHeat;
        this.pool = pool;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setSquareFootage(String x) {
        this.squareFootage = x;
    }

    public String getSquareFootage() {
        return this.squareFootage + "sq ft";
    }

    public boolean isGasHeat() {
        return gasHeat;
    }

    public void setGasHeat(boolean gasHeat) {
        this.gasHeat = gasHeat;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        if (numberOfBathrooms < 0) {
            System.out.println("Can't have negative numbers of bathrooms");
        } else {
            this.numberOfBathrooms = numberOfBathrooms;
        }
    }
}
