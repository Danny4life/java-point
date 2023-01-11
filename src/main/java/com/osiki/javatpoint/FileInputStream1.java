package com.osiki.javatpoint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {


    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("/Users/decagon/Desktop/test.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
