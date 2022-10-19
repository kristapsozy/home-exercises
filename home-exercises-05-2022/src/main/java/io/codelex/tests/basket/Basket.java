package io.codelex.tests.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> itemsInBasket = new ArrayList<>();
    private Integer itemsCount = 0;


    public void addToBasket(T item) {
        if (itemsCount == 10) {
            throw new BasketFullException("Basket is full!");
        }
        itemsInBasket.add(item);
        itemsCount++;
    }

    public void removeFromBasket(T item) {
        if (itemsCount == 0) {
            throw new BasketEmptyException("Basket is empty!");
        } else {
            itemsInBasket.remove(item);
            itemsCount--;
        }
    }

    public Integer getItemsCount() {
        return itemsCount;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "itemsInBasket=" + itemsInBasket +
                ", itemsCount=" + itemsCount +
                '}';
    }
}
