package com.tlc.tradingsystem.trade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FundTradeTest {
    FundTrade trade;

    @BeforeEach
    void setUp() {
        trade = new FundTrade("F1", Symbol.IBM, 200, 100, 0.4);
    }    

    @Test
    void givenDividend_PriceShouldIncreaseByFixedAmount() {
        double expected = 140;
        double actual = trade.calcDividend();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenChangeInPrice_PriceShouldIncreaseByFixedAmount() {
        trade.setPrice(200);
        trade.setDividend(0.04);
        double expected = 208.00;
        double actual = trade.calcDividend();

        Assertions.assertEquals(expected, actual);
    }
}
