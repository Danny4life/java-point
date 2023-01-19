package com.osiki.javatpoint;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritter2 {
    public static void main(String[] args) {
        try{

            FileWriter fw = new FileWriter("testout.txt");
            fw.write("i love javapoint");

            fw.close();

        }catch (Exception e){
            System.out.println(e);
            System.out.println("sucess");
        }
    }
}
