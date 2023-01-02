package com.osiki.javatpoint;

public class TestThrow1 {
    public static void main(String[] args) {
        validate(15);
        System.out.println("rest of the code");

    }

    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("You are too young");
        }else {
            System.out.println("welcome");
        }
    }



}
