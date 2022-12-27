package com.osiki.javatpoint;

public class Bike extends Vehicle {

    void run(){
        System.out.println("bike is running");
    }


    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
