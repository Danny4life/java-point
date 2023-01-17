package com.osiki.javatpoint;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
            SerializableExample s = (SerializableExample)in.readObject();
            System.out.println(s.id +"" + s.name);
            in.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
