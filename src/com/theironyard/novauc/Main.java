package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        House myHouse = new House("2000", false, true, 3, 2);

        myHouse.setSquareFootage("4000");
        System.out.println("myHouse is " + myHouse.getSquareFootage());

        myHouse.setGasHeat(true);

        if (myHouse.isGasHeat()) {
            System.out.println("Using gas heat");
        } else {
            System.out.println("Not using gas heat");
        }

        House otherHouse = new House("3000", true, true, 3, 2);
        System.out.println("otherHouse is " + otherHouse.getSquareFootage());

        otherHouse.setNumberOfBathrooms(-1);
        System.out.println("bathroom count " + otherHouse.getNumberOfBathrooms());
    }
}
