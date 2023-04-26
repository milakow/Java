package edu.sda.java.testing.exchange;

public class AccountManagerRunner {
    public static void main(String[] args) {
        ExchangeService exchangeService = new ExchangeServiceReal();
        AccountManager accountManager = new AccountManager(exchangeService);
        Account account = new Account(100, "EUR");
        int finalAmount = accountManager.amountInPLN(account);
        System.out.println(finalAmount);
    }
}
