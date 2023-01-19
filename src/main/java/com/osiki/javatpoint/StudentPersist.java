package com.osiki.javatpoint;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentPersist {

    public static void main(String[] args) throws Exception {

        Student3 s3 = new Student3(01, "Jon", 35);

        //writing object into file
        FileOutputStream f = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(s3);
        out.flush();
        out.close();
        f.close();

        System.out.println("success");

    }
}
