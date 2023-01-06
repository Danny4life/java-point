package com.osiki.javatpoint;

public class ThreadNaming extends Thread{
    @Override
    public void run() {
        super.run();

        System.out.println("running..");
    }

    public static void main(String[] args) {
        ThreadNaming t1 = new ThreadNaming();
        ThreadNaming t2 = new ThreadNaming();
        ThreadNaming t3 = new ThreadNaming();
        ThreadNaming t4 = new ThreadNaming();



        System.out.println("name of t1 " + t1.getName());
        System.out.println("name of t2 " + t2.getName());
        System.out.println("name of t3 " + t3.getName());
        System.out.println("name of t4 " + t4.getName());



        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.setName("segun thread");

        System.out.println("after changing name of t1 " + t1.getName());
    }
}
