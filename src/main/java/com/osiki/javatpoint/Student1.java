package com.osiki.javatpoint;

public class Student1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student1 s = new Student1();

        s.setName("segun");

        System.out.println(s.getName());
    }
}
