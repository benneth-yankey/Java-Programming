package com.tlc.tradingsystem.trade;

public class BondTrade extends Trade {
    private final double dividend;

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
    double calcDividend() {
        setPrice(getPrice() + getDividend());
        return getPrice();
    }
}
