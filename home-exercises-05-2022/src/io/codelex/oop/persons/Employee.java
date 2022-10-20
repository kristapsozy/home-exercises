package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    String position;
    LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        return Period.between(startedWorking, LocalDate.now()).getYears();
    }

    @Override
    public String getInfo() {
        return getPosition() + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years)";
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getStartedWorking() {
        return startedWorking;
    }
}
