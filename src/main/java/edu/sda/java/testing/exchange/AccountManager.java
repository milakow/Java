package edu.sda.java.testing.exchange;

/**
 * Create AccountManager class that for given Account is calculating the value in PLN.
 * Account provides amount as int and currency as String.
 * Other team will provide ExchangeService that will provide exchange rate to PLNExchangeService has one method:
 * 	double getExchangeRate(String currencyCode)
 * All amounts should be rounded to integers.
 */
public class AccountManager {

    private ExchangeService exchangeService;

    public AccountManager(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }
    public int amountInPLN(Account account) {
        return (int) (account.getAmount() * exchangeService.getExchangeRate(account.getCurrency()));
    }
}
