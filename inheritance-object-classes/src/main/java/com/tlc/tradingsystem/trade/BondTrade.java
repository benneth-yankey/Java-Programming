package com.tlc.tradingsystem.trade;

import com.tlc.tradingsystem.Symbol;

public class BondTrade extends Trade {
    private double dividend;

    public BondTrade(String id, Symbol symbol, int quantity, double dividend) {
        super(id, symbol, quantity);
        this.dividend = dividend;
    }

    public BondTrade(String id, Symbol symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.dividend = dividend;
    }

    public double getDividend() {
        return dividend;
    }

    @Override
    void calcDividend() {
        // TODO Auto-generated method stub
    }
}
