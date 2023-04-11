package com.osiki.javatpoint.jenkov;

public class Car {
    private String brand;
    int[] intArr = new int[10];

    public Car(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public static void main(String[] args) {
        int num = Math.abs(20);
        int num1 = Math.abs(-20);
        double c = Math.ceil(7.43);
        double f = Math.floor(7.43);
        int min = Math.min(30, 20);
        double random = Math.random() * 10D;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(c);
        System.out.println(f);
        System.out.println(random);

    }
}
