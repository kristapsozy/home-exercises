package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    int width;
    int height;
    int numberOfCopies;
    int costPerCopy;


    public Poster(int fee, int width, int height, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.width = width;
        this.height = height;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + numberOfCopies * costPerCopy;
    }

    public String toString() {
        return super.toString() +
                " Poster: width=" + width + " height=" + height +
                " number of copies=" + numberOfCopies + " cost per copy=" + costPerCopy;
    }
}
