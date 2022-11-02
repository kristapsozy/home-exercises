package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {

    private double gpa;

    public Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    @Override
    public void display() {
        System.out.println("GPA: " + getGpa()
                + ", Full name: "
                + getFirstName()
                + " "
                + getLastName()
                + ", Address: "
                + getAddress()
                + ", ID: " + getId());
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}