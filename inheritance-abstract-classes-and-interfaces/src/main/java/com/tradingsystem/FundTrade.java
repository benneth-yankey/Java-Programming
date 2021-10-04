package com.tradingsystem;

public class FundTrade extends Trade {
    private final double dividend;
    private double price;

    public FundTrade(String ID, Symbol symbol, int quantity, double dividend) {
        super(ID, symbol, quantity);
        this.dividend = (dividend / 100) * price;
    }

    public FundTrade(String ID, Symbol symbol, int quantity, double price, double dividend) {
        super(ID, symbol, quantity, price);
        this.dividend = (dividend / 100) * price;
    }

    @Override
    void calcDividend() {
        // TODO Auto-generated method stub
    }
}
