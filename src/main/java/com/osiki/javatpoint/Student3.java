package com.osiki.javatpoint;

import java.beans.Transient;
import java.io.Serializable;

public class Student3 implements Serializable {
    int id;
    String name;
    transient int age;

    public Student3(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
