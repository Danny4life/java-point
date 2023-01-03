package com.osiki.javatpoint;

public class TestThrow3 {

    public static void checkSum(int num){
        if(num < 1){
            throw new ArithmeticException("Number is negative, can not calculate square");
        } else {
            System.out.println("number" + num * num);
        }
    }

    public static void main(String[] args) {
        TestThrow3 obj = new TestThrow3();
        obj.checkSum(-3);
        System.out.println("rest of the code");

    }
}
