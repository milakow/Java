package advancedDevelopment.task8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Create a class named Basket, which simulates a basket and stores the current number of elements of type T (generic type) in the basket.
 * Add a method named addToBasket() that adds an element to the basket (increasing the current state by 1)
 * and a method named removeFromBasket() that removes an element from the basket (decreasing the current state by 1).
 *
 * The basket can hold from 0 to 10 elements. In case the user tries to remove an element when the state is 0
 * or add an element when the state is 10, throw the appropriate runtime exception (BasketFullException or BasketEmptyException).
 */
public class Basket<T> {
    List<T> basket = new LinkedList<>();
    int currentNumberOfElements;

    public Basket(int currentNumberOfElements) {
        this.currentNumberOfElements = currentNumberOfElements;
    }

    public void addToBasket(T element) throws BasketFullException {
        if (currentNumberOfElements < 10) {
            basket.add(element);
            currentNumberOfElements++;
        } else throw new BasketFullException("The basket is full.");
}

    public void removeFromBasket(T element) throws BasketEmptyException {
        if (currentNumberOfElements > 0) {
            basket.remove(element);
            currentNumberOfElements--;
        } else throw new BasketEmptyException("The basket is already empty.");
    }
}

//class MyBasket1 {
//    private String element;
//    private MyBasket1 myBasket1 = null;
//}
//
//class MyLinkedList{
//    private MyBasket1 firstNode = null;
//}
