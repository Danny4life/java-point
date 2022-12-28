package com.osiki.javatpoint;

public class A7 implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void show() {
        System.out.println("show");

    }

    public static void main(String[] args) {
        A7 obj = new A7();

        obj.print();
        obj.show();
    }
}
