package com.osiki.javatpoint;

public class TestGarbage {
    public void finalize(){
        System.out.println("garbaged collected");
    }

    public static void main(String[] args) {
        TestGarbage t1 = new TestGarbage();
        TestGarbage t2 = new TestGarbage();

        t1 = null;
        t2 = null;

        System.gc();
    }
}
