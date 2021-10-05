package com.tlc.tradingsystem.trade;

import com.tlc.tradingsystem.Symbol;

public abstract class Trade {
    private String id;
    private Symbol symbol;
    private int quantity;
    private double price;

    abstract void calcDividend();

    protected Trade(String id, Symbol symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    protected Trade(String id, Symbol symbol, int quantity) {
        this.id = id;
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
        return "Trade [id=" + id + ", price=" + price + ", quantity=" + quantity + ", symbol=" + symbol + "]";
    }    
}
