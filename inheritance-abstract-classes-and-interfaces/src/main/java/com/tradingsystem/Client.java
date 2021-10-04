package com.tradingsystem;

public class Client {
    String firstName;
    String lastName;    
    MemberShipType memberType;
    Trade trade;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
