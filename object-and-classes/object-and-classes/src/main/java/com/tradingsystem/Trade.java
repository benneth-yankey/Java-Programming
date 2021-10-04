package com.tradingsystem;

public class Trade {
    private String ID;
    private Symbol symbol;
    private int quantity;
    private double price;

    public Trade(String ID, Symbol symbol, int quantity, double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, Symbol symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price value");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trade [ID=" + ID + ", price=" + price + ", quantity=" + quantity + ", symbol=" + symbol + "]";
    }
}
