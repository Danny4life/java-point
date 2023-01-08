package com.osiki.javatpoint;

public class Runtime1 {
    public static void main(String[] args) throws Exception {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory: "+r.totalMemory());
        System.out.println("Free Memory: "+r.freeMemory());

        for(int i=0;i<10000;i++){
            new Runtime1();
        }
        System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: "+r.freeMemory());
        System.out.println("Total Memory: "+r.totalMemory());
    }
}
