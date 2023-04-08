package com.osiki.javatpoint.jenkov;

public class MyClass {

      private int num1 = 5;
      private int num2 = 10;

    public MyClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public MyClass() {

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static void main(String[] args) {
        MyClass cal = new MyClass();

        System.out.println(cal.getNum1() + cal.getNum2());
    }

}
