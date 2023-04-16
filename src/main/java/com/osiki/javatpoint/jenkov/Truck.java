package com.osiki.javatpoint.jenkov;

public class Truck extends Vehicle{
    private int seats;
    private int carDoors;

    public Truck(int seats, int carDoors) {
        this.seats = seats;
        this.carDoors = carDoors;
    }

    public Truck(String plateNumber, String color, int tyre, int seats, int carDoors) {
        super(plateNumber, color, tyre);
        this.seats = seats;
        this.carDoors = carDoors;
    }

    public Truck() {

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCarDoors() {
        return carDoors;
    }

    public void setCarDoors(int carDoors) {
        this.carDoors = carDoors;
    }
}
