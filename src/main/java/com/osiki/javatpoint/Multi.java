package com.osiki.javatpoint;

public class Multi extends Thread{
    @Override
    public void run() {
        super.run();

        System.out.println("thread is running");
    }



    public static void main(String[] args) {
        Multi s1 = new Multi();

        s1.start();
    }
}
