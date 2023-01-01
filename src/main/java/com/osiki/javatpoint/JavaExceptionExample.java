package com.osiki.javatpoint;

public class JavaExceptionExample {
    public static void main(String[] args) {




        try {
            int data = 50/0;
            System.out.println(data);


        }catch (ArithmeticException e){
            System.out.println("cant be divided by zero");
        }
        System.out.println("rest of the code");

    }
}
