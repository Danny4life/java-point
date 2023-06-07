package com.osiki.javatpoint.jenkov.dateTimeTutorials;

public class ClassOne {

    public static void main(String[] args) {
        // time in miliseconds


        long startTime = System.currentTimeMillis();
        System.out.println(callOperation(3, 5));
        long endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        System.out.println(totalTime);
    }

    public static int callOperation(int a, int b){
        return a + b;
    }
}
