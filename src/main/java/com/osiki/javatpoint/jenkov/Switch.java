package com.osiki.javatpoint.jenkov;

public class Switch {
    public static void main(String[] args) {
        int amount = 10;

        switch (amount) {
            case 0:
                System.out.println("amount is 0");
                break;
            case 5:
                System.out.println("amount is 5");
                break;
            case 10:
                System.out.println("amount is 10");
                break;
            default:
                System.out.println("amount is something else");
        }

        System.out.println(switchOnInt(10));
        System.out.println(fullName("Segun", "osiki"));
        //System.out.println(shirtSize('M'));


    }

    public static int switchOnInt(int size){
        switch (size){
            case 0: return 0;
            case 5: return 5;
            case 10: return 10;



        }

        return 20;

    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    private static void shirtSize(char size){

        switch (size){
            case 'M':
                System.out.println("size is small");
                break;
            case 'L':
                System.out.println("size is large");
                break;
            default:
                System.out.println("nothing");

        }

        //System.out.println(shirtSize('M'));

    }
}
