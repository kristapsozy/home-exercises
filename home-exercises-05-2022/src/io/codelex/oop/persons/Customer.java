package io.codelex.oop.persons;

public class Customer extends Person {
    int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getId() + " (" + getPurchaseCount() + " purchases)";
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }
}
