package com.osiki.javatpoint;

public class College {

    private String schoolName = "icc";

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }



    public static void main(String[] args) {
        College c = new College();
        c.setSchoolName("Baptist");
        System.out.println(c.getSchoolName());
    }


}
