package com.osiki.javatpoint.jenkov;

public class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("My thread is running");
    }

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }
}
