package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortfolioTest {
    @Test
    public void shouldBeAbleToGetCurrentValue() {
        Portfolio p = new Portfolio();
        assertEquals(0, p.currentValue());
    }
    @Test
    public void shouldBeAbleToBuyStock() {
        Portfolio p = new Portfolio();
        Stock company = new Stock("XYZ", 50);

        p.buyStock(company, 1);
        assertEquals(50, p.currentValue());
    }
    @Test
    public void shouldBeAbleToBuyMultipleOrdersOfTheSameStock() {
        Portfolio p = new Portfolio();
        Stock company = new Stock("XYZ", 50);

        p.buyStock(company, 1);
        p.buyStock(company, 2);
        p.buyStock(company, 3);
        assertEquals(300, p.currentValue());
    }
    @Test
    public void currentValueShouldIncreaseWhenStockIncreases() {
        Portfolio p = new Portfolio();
        Stock company = new Stock("XYZ", 50);

        p.buyStock(company, 1);
        company.increasePrice(5);
        assertEquals(55, p.currentValue());
    }

    @Test
    public void currentValueShouldDecreaseWhenStockIncreases() {
        Portfolio p = new Portfolio();
        Stock company = new Stock("XYZ", 50);

        p.buyStock(company, 1);
        company.decreasePrice(5);
        assertEquals(45, p.currentValue());
    }
}
