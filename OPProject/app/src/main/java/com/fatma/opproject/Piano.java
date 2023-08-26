package com.fatma.opproject;

public class Piano implements Insturement, HouseDecor {
    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("Override methode");
    }
}
