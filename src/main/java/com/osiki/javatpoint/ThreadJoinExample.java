package com.osiki.javatpoint;

public class ThreadJoinExample {
    public static void main(String[] args) {
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

        th1.start();

        try {
            System.out.println("the current thread name is " + Thread.currentThread().getName());
            th1.join();
        } catch (Exception e){
            System.out.println(e);
        }

        th2.start();
        try{
            System.out.println("the current thread name is " + Thread.currentThread().getName());
            th2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        th3.start();
    }
}
