package com.osiki.javatpoint;

public class Employee {
    String name;
    int salary;
    Address address;

    public Employee(String name, int salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    void display(){
        System.out.println(name + " " + salary);
        System.out.println(address.street + " " + address.city + " " + address.country);
    }



}
