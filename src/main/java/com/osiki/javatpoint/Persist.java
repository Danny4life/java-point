package com.osiki.javatpoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
    public static void main(String[] args) {


        try {
            SerializableExample s1 = new SerializableExample(001, "Jane");
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(s1);

            out.flush();
            out.close();

            System.out.println("sucesss");

        }catch (Exception e){
            System.out.println(e);

        }
    }
}
