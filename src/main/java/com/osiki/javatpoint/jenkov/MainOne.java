package com.osiki.javatpoint.jenkov;

public class MainOne {
    public static void main(String[] args) {
        Car2 corolla = new Car2();
        Truck dana = new Truck();

        corolla.setPlateNumber("NB2304");
        corolla.setColor("Red");
        corolla.setCarDoors(4);
        corolla.setSeat(4);
        corolla.setTyre(4);
        dana.setPlateNumber("MBS2304");

        System.out.println("Dana truck has a register number of : " + dana.getPlateNumber());
        System.out.println("**********************************");
        System.out.println("Corolla car has a register number of : " + corolla.getPlateNumber() + "\n"
                            + "Color is : " + corolla.getColor() + "\n" + "Car doors : " + corolla.getCarDoors()
                            + "\n" + "Number of tyres :" + corolla.getTyre() + "\n" + "Car seats is :" + corolla.getSeat());
    }


}
