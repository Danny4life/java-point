package com.osiki.javatpoint.jenkov;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {

    public String name;
    public int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[3];
        employeeArr[0] = new Employee("segun", 1);
        employeeArr[1] = new Employee("zoe", 3);
        employeeArr[2] = new Employee("moses", 2);

        Arrays.sort(employeeArr, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.id - e2.id;
            }
        });

        for(int i = 0; i < employeeArr.length; i++){
            System.out.println(employeeArr[i].name);
        }

    }
}
