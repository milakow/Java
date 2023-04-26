package edu.sda.java.testing.exchange;

public class Account {
    private int amount;
    private String currency;

    public Account(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }
    public String getCurrency() {
        return currency;
    }

}
