package com.BridgeLabZ.AddressBookSystem;

import java.time.LocalDate;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String mobileNumber;
    private String email;
    private LocalDate entryDate;

    public Person(int id, String firstName, String lastName, String address, String city, String state, String zip, String mobileNumber, String email, LocalDate entryDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        String persondetails;
        persondetails = "\nID: " + id +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAddress: " + address +
                "\nCity: " + city +
                "\nState: " + state +
                "\nZip: " + zip +
                "\nMobile Number: " + mobileNumber +
                "\nEmail: " + email +
                "\nEntry Date: " + entryDate;
        return persondetails;
    }
}
