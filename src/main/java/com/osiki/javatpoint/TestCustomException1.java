package com.osiki.javatpoint;

public class TestCustomException1 {

    static void validate(int age) throws CustomException{
        if(age < 18){
            throw new CustomException("you are not eligible to vote");
        }else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(13);
        }catch (CustomException ex){
            System.out.println("caught the exception");
            System.out.println("exception occured " + ex);

        }
        System.out.println("rest of the code...");
    }
}
