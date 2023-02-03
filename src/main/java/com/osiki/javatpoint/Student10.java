package com.osiki.javatpoint;

import java.util.ArrayList;
import java.util.Iterator;

public class Student10 {

    String name;
    int age;
    int rollNo;

    public Student10(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }


    public static void main(String[] args) {
        Student10 s1 = new Student10("zoe", 1, 001);
        Student10 s2 = new Student10("seg", 14, 002);
        Student10 s3 = new Student10("joe", 21, 004);

        System.out.println(s1.name + " " + s1.age + " " + s1.rollNo);
        System.out.println(s2.name + " " + s2.age + " " + s2.rollNo);
        System.out.println(s3.name + " " + s3.age + " " + s3.rollNo);

        System.out.println("After arraylist");

        ArrayList<Student10> arr = new ArrayList<Student10>();

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        Iterator itr = arr.iterator();

        while (itr.hasNext()){
            Student10 st = (Student10)itr.next();

            System.out.println(st.name + " " + st.age + " " + st.rollNo);
        }




    }
}
