package com.osiki.javatpoint.jenkov;

public class Car1 {

    private String model;
    private String color;
    private int tyre;

    public Car1() {

    }

    public Car1(String model, String color, int tyre) {
        this.model = model;
        this.color = color;
        this.tyre = tyre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Car1 carA = new Car1();
        carA.setColor("red");
        System.out.println(carA.getColor());
    }
}
