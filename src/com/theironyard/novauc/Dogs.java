package com.theironyard.novauc;

/**
 * Created by christinekoufos old on 2/7/17.
 */
public class Dogs {
    String breed;
    String color;
    int weight;
    int age;
    boolean dryFood;

    public Dogs(String breed, String color, int weight, int age, boolean dryFood) {
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.dryFood = dryFood;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDryFood() {
        return dryFood;
    }

    public void setDryFood(boolean dryFood) {
        this.dryFood = dryFood;
    }
}
