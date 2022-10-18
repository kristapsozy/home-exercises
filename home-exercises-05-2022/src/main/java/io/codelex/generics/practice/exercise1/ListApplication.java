package io.codelex.generics.practice.exercise1;

public class ListApplication {
    public static void main(String[] args) {
        Person person = new Person(10, "John");
        person.add(0, person);
        System.out.println(person.get(0));


        Lion lion = new Lion(5, 50, "Africa");
        Zebra zebra = new Zebra(9, 200, "Africa");
        Elephant elephant = new Elephant(20, 900, "Africa");

        lion.add(0, lion);
        zebra.add(0, zebra);
        elephant.add(0, elephant);
        System.out.println(lion.get(0));
        System.out.println(zebra.get(0));
        System.out.println(elephant.get(0));


        MyList<Animal> myList = new MyList<Animal>();
        myList.add(0, zebra);
        myList.add(1, lion);
        System.out.println(myList);

        MyList<String> stringMyList = new MyList<>();
        stringMyList.add(0, "String");
    }
}
