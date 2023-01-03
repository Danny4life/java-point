package com.osiki.javatpoint;

public class Outer {
    private int data = 30;

    public class Inner {

        void msg(){
            System.out.println("data " + data);
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();

        in.msg();
    }
}
