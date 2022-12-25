package com.osiki.javatpoint;

public class Account {
    int accountNumber;
    String accountName;
    float amount;


    void insertDetails(int accountNumber, String accountName, float amount){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = amount;
    }

    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt + " " + "deposited");
    }

    void withdraw(float amt){
        if(amount < amt){
            System.out.println("Insufficient balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " " + "withdrawn");
        }


    }

    void checkBalance(){
        System.out.println("Balance is " + amount);
    }

    void display(){
        System.out.println("Account Number:" + accountNumber +  "\n" + "Account Name:" + accountName + "\n" + "Initial Deposit:" + amount);
    }




}
