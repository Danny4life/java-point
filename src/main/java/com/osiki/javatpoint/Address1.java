package com.osiki.javatpoint;

public class Address1 {
    String city;
    String street;

    public Address1(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address1{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
