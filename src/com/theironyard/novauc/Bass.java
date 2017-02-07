package com.theironyard.novauc;

/**
 * Created by christinekoufos old on 2/7/17.
 */
public class Bass {
    String text;
    boolean isAlive;
    int quantity;
    int aliveQuantity;
    String species;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >5) {
            System.out.println("disqualified");
        } else{
            this.quantity = quantity;
        }
    }

    public int getAliveQuantity() {
        return aliveQuantity;
    }

    public void setAliveQuantity(int aliveQuantity) {
        this.aliveQuantity = aliveQuantity;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Bass(String text, boolean isAlive, int quantity, int aliveQuantity, String species) {

        this.text = text;
        this.isAlive = isAlive;
        this.quantity = quantity;
        this.aliveQuantity = aliveQuantity;
        this.species = species;
    }
}
