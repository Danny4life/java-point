package com.osiki.javatpoint;

public class Student {
    int rollNo;
    String name;

    void insertDetails(int r, String n){
        this.rollNo = r;
        this.name = n;
    }

    void displayInformation(){
        System.out.println(rollNo + " " + name);
    }
}
