package org.ulpgc.is1.model;

public class Address {
    private String street;
    private int CAP;
    private int number;
    private String city;

    public Address(String street, int CAP, int number, String city) {
        this.street = street;
        this.CAP = CAP;
        this.number = number;
        this.city = city;

    }
}
