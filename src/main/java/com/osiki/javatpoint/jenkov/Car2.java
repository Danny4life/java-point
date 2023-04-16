package com.osiki.javatpoint.jenkov;

public class Car2 extends Vehicle{


    private int seat;
    private int carDoors;


    public Car2(int seat, int carDoors) {
        this.seat = seat;
        this.carDoors = carDoors;
    }

    public Car2(String plateNumber, String color, int tyre, int seat, int carDoors) {
        super(plateNumber, color, tyre);
        this.seat = seat;
        this.carDoors = carDoors;
    }

    public Car2() {

    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getCarDoors() {
        return carDoors;
    }

    public void setCarDoors(int carDoors) {
        this.carDoors = carDoors;
    }
}
