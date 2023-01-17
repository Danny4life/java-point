package com.osiki.javatpoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeISA {
    public static void main(String[] args) {
        try{

            // serialize the object
            Student5 s1 = new Student5(1, "john", 5000, "First");
            FileOutputStream file = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(s1);
            out.flush();
            out.close();

            System.out.println("success");

        }catch (Exception e){
            System.out.println(e);
        }

        // deserialize the object
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student5 s = (Student5)in.readObject();
            System.out.println(s.id + " " + s.name + " " + " " + s.fee + " " + s.position );
            in.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
