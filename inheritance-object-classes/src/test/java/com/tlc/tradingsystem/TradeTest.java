package com.tlc.tradingsystem;

import com.tlc.tradingsystem.trade.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TradeTest {
    private Trade trade;

    @BeforeEach
    void setUp() {
        trade = new FundTrade("T1", Symbol.AAPL, 100, 23.99);
    }

    @Test
    void givenPositiveValue_ThenAssertionSucceeds() {
        // Trade trade = new Trade("T1", Symbol.AAPL, 100);
        double actual = 23.99;
        trade.setPrice(actual);
        Assertions.assertEquals(trade.getPrice(), actual);
    }

    @Test
    void givenNegativeValue_ThenThrowIllegalArgumentException() {
        // Trade trade = new Trade("T1", Symbol.AAPL, 100);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            trade.setPrice(-23.99);
        });
        String expectedMessage = "Invalid price value";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
        // Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}   
