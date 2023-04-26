package edu.sda.java.testing.exchange;

public class ExchangeServiceReal implements ExchangeService {
    @Override
    public double getExchangeRate(String currencyCode) {
        return 4;
    }
}
