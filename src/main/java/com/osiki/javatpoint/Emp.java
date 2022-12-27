package com.osiki.javatpoint;

public class Emp extends Person {

    float salary;

    public Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    void display(){
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Emp em1 = new Emp(10, "segun", 30000);

        em1.display();
    }
}
