package edu.sda.java.testing;

import static org.mockito.Mockito.*;
import edu.sda.java.testing.exchange.Account;
import edu.sda.java.testing.exchange.AccountManager;
import edu.sda.java.testing.exchange.ExchangeService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;



class AccountManagerTest {

    ExchangeService exchangeService = mock();
    AccountManager accountManager = new AccountManager(exchangeService);

    @Test
    void shouldExchangeServiceAcceptNumberAndCurrency() {
        when(exchangeService.getExchangeRate("USD")).thenReturn(3.5);

        int result = accountManager.amountInPLN(new Account(100, "USD"));

        assertThat(result).isEqualTo(350);
    }

    @Test
    void shouldExchangeServiceAcceptNumberAndCurrency2() {
        when(exchangeService.getExchangeRate("EUR")).thenReturn(4.5);

        int result = accountManager.amountInPLN(new Account(200, "EUR"));

        assertThat(result).isEqualTo(900);
    }

    @Test
    void should
}

