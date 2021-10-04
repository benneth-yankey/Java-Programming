package com.tradingsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TraderTest {
    @Test
    void testQuantityAndPriceArithmetic() {
        Trade trade = new Trade("T1", Symbol.AAPL, 100, 23.99);
        double actual = 2399;
        Trader trader = new Trader();
        trader.addTrade(trade);
        Assertions.assertEquals(trader.getAccount().getValue(), actual);
    }
}
