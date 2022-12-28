package com.osiki.javatpoint;

public class Account2 {
    private int acc_no;
    private String accName;
    private String email;
    float amt;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmt() {
        return amt;
    }

    public void setAmt(float amt) {
        this.amt = amt;
    }

    public static void main(String[] args) {
        Account2 acc = new Account2();

        acc.setAcc_no(1234567890);
        acc.setAccName("segun");
        acc.setEmail("seg@gmail.com");
        acc.setAmt(50000);

        System.out.println(acc.getAccName() + " " + "account number is:" +
                          " " + acc.getAcc_no() + ", " + "with email:" +
                            " " + acc.getEmail() + " " + "with account balance of:" + acc.getAmt());
    }
}
