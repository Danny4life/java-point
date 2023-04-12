package com.osiki.javatpoint.jenkov;

public class Myclass1 {

    public void printBoth(String text1, String text2){
        print(text1);
        print(text2);
    }

    public void print(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {
        boolean isValid = false;

        if(isValid){
            System.out.println("Valid is true");
        }else
        //System.out.println("Valid is not true");

           // System.out.println(value);


    }

    String val = "30";

    int value = val == null ? 0 : val == "" ? 0 : Integer.parseInt(val);




}
