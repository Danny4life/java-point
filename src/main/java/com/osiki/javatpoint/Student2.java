package com.osiki.javatpoint;

public class Student2 implements Cloneable{
    int rollNo;
    String name;

    public Student2(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();

    }

    public static void main(String[] args) {
        try {
            Student2 s1 = new Student2(101, "segun");
            Student2 s2 = (Student2)s1.clone();

            System.out.println(s1.rollNo + "" + s1.name);
            System.out.println(s2.rollNo + "" + s2.name);
        }catch (CloneNotSupportedException c){}
    }
}
