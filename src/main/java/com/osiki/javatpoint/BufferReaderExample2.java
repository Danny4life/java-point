package com.osiki.javatpoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderExample2 {
    public static void main(String[] args) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter your name");

        String name = br.readLine();

        System.out.println("Welcome " + name);

    }
}
