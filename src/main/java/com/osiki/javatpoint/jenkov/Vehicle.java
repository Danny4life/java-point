package com.osiki.javatpoint.jenkov;

public class Vehicle {

    private String plateNumber;
    private int tyre;

    private String color;

    public Vehicle() {
    }

    public Vehicle(String plateNumber, String color, int tyre) {
        this.plateNumber = plateNumber;
        this.tyre = tyre;
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
