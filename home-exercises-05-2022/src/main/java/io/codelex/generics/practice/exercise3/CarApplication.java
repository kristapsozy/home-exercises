package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        Audi audi = new Audi("A4", 1.9);
        BMW bmw = new BMW("X5", 3.0);

        List<Audi> audiList = new ArrayList<>();
        audiList.add(audi);

        List<BMW> bmwList = new ArrayList<>();
        bmwList.add(bmw);

        addAllX(audiList, carList);
        // With <? super T> this works!
        // Because <? super T> means that we need to add to List that is T parent class.

        // !! addAllY(audiList, carList); !!

        //With List<V> v, List<V> l this don't work, because required type is T.
        // In this case T is Audi, but we try to add it in (Parent) Car class List.


        // So it's true that addAllX is less restrictive than addAllY.
    }

    public static <T> void add(T value, List<? super T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) {
            l.add(el);
        }
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) {
            l.add(el);
        }
    }

}
