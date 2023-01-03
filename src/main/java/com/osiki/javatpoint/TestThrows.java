package com.osiki.javatpoint;

public class TestThrows {
    public static int dividesum(int m, int n) throws ArithmeticException{
        int div = m / n;
        return div;
    }

    public static void main(String[] args) {

            TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.dividesum(40, 0));
        }catch (ArithmeticException e){
            System.out.println("number can not be divided by zero");
        }
        System.out.println("rest of the code");
    }

}
