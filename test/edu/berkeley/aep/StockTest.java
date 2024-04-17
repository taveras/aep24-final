package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {
    @Test
    public void shouldBeAbleToGetCurrentPrice() {
        Stock company = new Stock("ABC", 100);
        assertEquals(100, company.currentPrice());
    }

    @Test
    public void canIncreasePrice() {
        Stock company = new Stock("ABC", 100);
        company.increasePrice(5);
        assertEquals(105, company.currentPrice());
    }
}
