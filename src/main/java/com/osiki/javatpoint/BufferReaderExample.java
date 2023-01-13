package com.osiki.javatpoint;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("text1.txt");
        BufferedReader br = new BufferedReader(fr);


        int i;

        while((i = br.read()) != - 1){
            System.out.println((char) i);
        }

        br.close();
        fr.close();

    }
}
