package com.osiki.javatpoint;

import java.util.Scanner;

public class ScannerExample1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Name: " + name);
        in.close();
    }
}
