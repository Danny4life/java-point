package com.osiki.javatpoint;

public class JavaArray1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


        int[] a = new int[]{1,2,3,4,5,6,7};

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
