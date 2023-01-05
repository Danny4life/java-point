package com.osiki.javatpoint;

public class Multi1 implements Runnable{


    public void run (){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Multi1 t1 = new Multi1();
        Thread t2 = new Thread(t1);

        t2.start();
    }
}
