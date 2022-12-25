package com.osiki.javatpoint;

public class ShowAccount {

    public static void main(String[] args) {
        Account a1 = new Account();

        a1.insertDetails(2070323100, "segun", 1000);


        a1.display();
        a1.deposit(40000);
        a1.withdraw(100000);
        a1.checkBalance();
    }
}
