package edu.sda.java.testing;

/**
 * Create AccountManager class that for given Account is calculating the value in PLN.
 * Account provides amount as int and currency as String.
 * Other team will provide ExchangeService that will provide exchange rate to PLNExchangeService has one method:
 * 	double getExchangeRate(String currencyCode)
 * All amounts should be rounded to integers.
 */
public class AccountManager {

    static class Account {
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

    static class ExchangeService {
        double getExchangeRate(String currencyCode) {
            return 0;
        }
    }

}
