package com.tlc.tradingsystem.client;

import com.tlc.tradingsystem.membership.MembershipType;
import com.tlc.tradingsystem.trade.Trade;

public class Client {
    String firstName;
    String lastName;    
    MembershipType membershipType;
    Trade trade;
    int point;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
