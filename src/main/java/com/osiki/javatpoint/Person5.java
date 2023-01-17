package com.osiki.javatpoint;

import java.io.Serializable;

public class Person5 implements Serializable {
    int id;
    String name;

    public Person5(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
