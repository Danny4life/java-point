package com.osiki.javatpoint;

public class SimpleThread implements Runnable {

    public static Thread t3;
    public static Thread t4;
    public static ThreadState obj1;

    public static void main(String[] args) throws InterruptedException {
        obj1 = new ThreadState();
        t3 = new Thread(obj1);
        t4 = new Thread(obj1);



        System.out.println("the state of t4: " + t4.getState());

        t4.start();

        System.out.println("the state of t4 after calling the start method: " + t4.getState());

        Thread.sleep(400);
        System.out.println("the state of t4 after calling the sleep method: " + t4.getState());

        t4.join();
        System.out.println("the state of t4 after calling the join method: " + t4.getState());



        System.out.println(t3.getState());

        t3.start();
        System.out.println(t3.getState());



        try
        {

            Thread.sleep(300);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("thread t3 state " + t3.getState());

        try
        {
            t3.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("the state of t3 after calling the join method: " + t3.getState());
    }


    @Override
    public void run() {
    }
}
