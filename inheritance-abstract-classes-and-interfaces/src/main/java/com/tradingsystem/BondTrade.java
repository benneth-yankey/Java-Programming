package com.tradingsystem;

public class BondTrade extends Trade {
    private final double dividend;

    public BondTrade(String ID, Symbol symbol, int quantity, double dividend) {
        super(ID, symbol, quantity);
        this.dividend = dividend;
    }

    public BondTrade(String ID, Symbol symbol, int quantity, double price, double dividend) {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
    }

    @Override
    void calcDividend() {
        // TODO Auto-generated method stub
    }
}
