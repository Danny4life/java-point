package com.osiki.javatpoint;

public class ThreadJoin extends Thread{

    @Override
    public void run() {
        super.run();

        for(int j = 0; j < 2; j++){
            try {
                Thread.sleep(300);
                System.out.println("the current thread name is " + Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(j);
        }


    }
}
