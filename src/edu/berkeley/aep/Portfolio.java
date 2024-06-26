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

    public void buyStock(Stock stockToBuy, int quantityToBuy) {
        var currentQuantity = stockQuantities.get(stockToBuy);
        if (currentQuantity == null) {
            stockQuantities.put(stockToBuy, quantityToBuy);
            return;
        }

        stockQuantities.put(stockToBuy, currentQuantity + quantityToBuy);
    }
    public int sellStock(Stock stockToSell, int quantityToSell) {
        var currentQuantity = stockQuantities.get(stockToSell);
        if (currentQuantity == null || quantityToSell > currentQuantity) {
            throw new RuntimeException("Unable to sell stock that you do not own");
        }

        stockQuantities.put(stockToSell, currentQuantity - quantityToSell);
        return stockToSell.currentPrice() * quantityToSell;
    }
}
