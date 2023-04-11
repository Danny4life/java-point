package com.osiki.javatpoint.jenkov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("min value = " + min);
        System.out.println("max value = " + max);


    }

}
