package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortfolioTest {
    @Test
    public void shouldBeAbleToGetCurrentValue() {
        Portfolio p = new Portfolio();
        assertEquals(0, p.currentValue());
    }
}
