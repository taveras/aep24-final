package edu.berkeley.aep;


public class Stock {
    private final String symbol;
    private int price;

    public Stock(String symbol, int initialPrice) {

        this.symbol = symbol;
        this.price = initialPrice;
    }

    public int currentPrice() {
        return price;
    }

    public void increasePrice(int amount) {
        price += amount;
    }

    public void decreasePrice(int amount) {
        price -= amount;
    }
}
