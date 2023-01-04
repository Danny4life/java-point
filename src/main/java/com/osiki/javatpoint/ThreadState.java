package com.osiki.javatpoint;

public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    public static void main(String[] args) {
        // creating an object of the class ThreadState
        obj = new ThreadState();
        t1 = new Thread(obj);

        // thread t1 is spawned
        // The thread t1 is currently in the NEW state.

        System.out.println("The state of thread t1 after spawning it - " + t1.getState());

        // invoking the start() method on
        // the thread t1

        t1.start();

        // thread t1 is moved to the Runnable state
        System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
    }

    @Override
    public void run() {
        ABC myObj = new ABC();
        Thread t2 = new Thread();

        // thread t2 is created and is currently in the NEW state.

        System.out.println("The state of thread t2 after spawning it - "+ t2.getState());

        t2.start();

        // thread t2 is moved to the runnable state

        System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());

        try {
            Thread.sleep(200);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState());

        try {
            t2.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();

        }
        System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());

    }
}