package com.osiki.javatpoint;

public class ThreadSleepMethod1 extends Thread {

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(1500);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleepMethod1 t1 = new ThreadSleepMethod1();
        ThreadSleepMethod1 t2 = new ThreadSleepMethod1();

        t1.run();
        t2.run();
    }
}
