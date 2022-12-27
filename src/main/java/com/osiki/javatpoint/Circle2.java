package com.osiki.javatpoint;

public class Circle2 implements Shape2{

    @Override
    public void draw() {
        System.out.println("i am drawing");
    }

    public static void main(String[] args) {
        Circle2 c = new Circle2();

        c.draw();
    }
}
