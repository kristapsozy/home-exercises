package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonApp {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "12344",
                55, "Accountant", LocalDate.of(1997, 01, 02));
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Anna", "Panna", "3231AB", 74, 17);
        System.out.println(customer.getInfo());
    }
}

