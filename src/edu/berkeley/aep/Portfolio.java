package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Portfolio {
    private Map<Stock,Integer> stockQuantities = new HashMap<>();
    public Portfolio() {}
    public int currentValue() {
        int result = 0;
        for(Stock s : stockQuantities.keySet()) {
            result += s.currentPrice() * stockQuantities.get(s);
        }
        return result;
    }

    public void buyStock(Stock stockToBuy, int quantity) {
        stockQuantities.put(stockToBuy, quantity);
    }
}
