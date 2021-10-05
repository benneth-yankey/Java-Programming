package com.tlc.tradingsystem.trade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BondTradeTest {
    BondTrade trade;

    @BeforeEach
    void setUp() {
        trade = new BondTrade("B1", Symbol.AAPL, 100, 40.00, 8);
    }    
    
    @Test
    void givenDividend_PriceShouldIncreaseByFixedAmount() {
        double expected = 48.00;
        double actual = trade.calcDividend();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenChangeInPrice_PriceShouldIncreaseByFixedAmount() {
        trade.setPrice(22.00);
        double expected = 30.00;
        double actual = trade.calcDividend();

        Assertions.assertEquals(expected, actual);
    }
}
