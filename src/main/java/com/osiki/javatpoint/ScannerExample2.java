package com.osiki.javatpoint;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        String s = "Hello, this is javapoint";

        Scanner scan = new Scanner(s);

        System.out.println(scan.hasNext());
        System.out.println(scan.hasNextLine());
        scan.close();

        System.out.println("----Enter Your Details----");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = in.next();
        System.out.println("firstName " + firstName);
        System.out.println("Enter your last name");
        String lastName = in.next();
        System.out.println("lastname " + lastName);
        System.out.println("Enter your age");
        int i = in.nextInt();
        System.out.println("Age " + i);
        System.out.println("Enter your monthly salary");
        double d = in.nextDouble();
        System.out.println("salary " + d);
        System.out.println("My name is " + firstName +  " " + lastName  + " " + "i am " + i + " " + "years old"
                            + "," + "i earn " + d + "usd" + " " + "per month");
    }
}
