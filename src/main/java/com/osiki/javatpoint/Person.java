package com.osiki.javatpoint;

@MyAnnotation(value = "123", name = "segun", age = 30, newNames = {"omo", "randy"})

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


