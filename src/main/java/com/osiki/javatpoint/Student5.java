package com.osiki.javatpoint;

public class Student5 extends Person5{

    int fee;
    String position;

    public Student5(int id, String name, int fee, String position) {
        super(id, name);
        this.fee = fee;
        this.position = position;
    }
}
