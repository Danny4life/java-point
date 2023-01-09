package com.osiki.javatpoint;

public class TestInteruptThread extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i = 1; i <=5; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestInteruptThread t1 = new TestInteruptThread();

        t1.start();

        t1.interrupt();
    }
}
