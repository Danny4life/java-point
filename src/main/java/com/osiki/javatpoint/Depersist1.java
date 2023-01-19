package com.osiki.javatpoint;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist1 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
        Student3 s = (Student3) in.readObject();
        System.out.println(s.id + " " + s.name + " " + s.age);
        in.close();


    }
}
