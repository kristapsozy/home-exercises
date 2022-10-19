package io.codelex.tests.basket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    void testAppleBasketWithTwoApples() {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        Assertions.assertEquals(2, appleBasket.getItemsCount());
    }

    @Test
    void testMushroomBasketWithTwoMushrooms() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        Assertions.assertEquals(2, mushroomBasket.getItemsCount());
    }

    @Test
    void testTryToGetAppleFromEmptyBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        Apple apple = new Apple();
        BasketEmptyException error = Assertions.assertThrows(BasketEmptyException.class,
                () -> appleBasket.removeFromBasket(apple));
        Assertions.assertEquals("Basket is empty!", error.getMessage());
    }

    @Test
    void testTryToAddMushroomToFullBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        for (int i = 0; i < 10; i++) {
            mushroomBasket.addToBasket(new Mushroom());
        }
        BasketFullException error = Assertions.assertThrows(BasketFullException.class,
                () -> mushroomBasket.addToBasket(new Mushroom()));
        Assertions.assertEquals("Basket is full!", error.getMessage());
    }


}
