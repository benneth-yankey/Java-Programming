package com.tradingsystem;

public class Trader {
    private String name;
    private Account account = new Account();

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTrade(Trade trade) {
       double total = trade.getPrice() * trade.getQuantity(); 
    //    account = new Account();
       account.setValue(total);
    }
}
