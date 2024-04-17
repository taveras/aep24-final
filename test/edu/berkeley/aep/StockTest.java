package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

    @Test
    public void canNotIncreasePriceByNegativeNumber() {
        Stock company = new Stock("ABC", 100);
        assertThrows(
                RuntimeException.class,
                () -> company.increasePrice(-5)
        );
    }

    @Test
    public void canDecreasePrice() {
        Stock company = new Stock("ABC", 100);
        company.decreasePrice(5);
        assertEquals(95, company.currentPrice());
    }

    @Test
    public void canNotDecreasePriceByNegativeNumber() {
        Stock company = new Stock("ABC", 100);
        assertThrows(
                RuntimeException.class,
                () -> company.decreasePrice(-5)
        );
    }
}
