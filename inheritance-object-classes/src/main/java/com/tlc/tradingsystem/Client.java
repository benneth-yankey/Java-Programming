package com.tlc.tradingsystem;

import com.tlc.tradingsystem.membership.MemberShipType;
import com.tlc.tradingsystem.trade.Trade;

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
