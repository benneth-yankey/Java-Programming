package com.tlc.tradingsystem.trade;

public class FundTrade extends Trade {
    private double dividend;

    public FundTrade(String ID, Symbol symbol, int quantity, double dividend) {
        super(ID, symbol, quantity);
        this.dividend = dividend;
    }

    public FundTrade(String ID, Symbol symbol, int quantity, double price, double dividend) {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    @Override
    double calcDividend() {
        double calculatedDividend = getPrice() * getDividend();
        setPrice(getPrice() + calculatedDividend);
        return getPrice();
    }
}
