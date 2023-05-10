package advancedDevelopment.task8;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    public void checkIfAddingWorksWithEmptyBasket() throws BasketFullException {
        //given
        Basket<String> basket = new Basket<>(new LinkedList<>());

        //when
        basket.addToBasket("Atos");

        //then
//        assertThrows()


    }

}