package com.osiki.javatpoint.jenkov.exercise.java;

public class Exercise3 {
    public static void main(String[] args) {
        int[] ele = {1,2,3,4,5,6,7,8,9};

        int sum = 0;

        for(int i = 0; i < ele.length; i++){
            sum += ele[i];
        }

        System.out.println(sum);
    }
}
