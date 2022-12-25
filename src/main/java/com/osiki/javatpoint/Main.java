package com.osiki.javatpoint;

public class Main {

    public static void main(String[] args) {
        Address ad1 = new Address("damian", "benin", "nigeria");

        Employee em1 = new Employee("Segun", 3000, ad1);

      em1.display();


    }
}
