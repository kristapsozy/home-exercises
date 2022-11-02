package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {

        Student student = new Student("John",
                "Brown",
                "New York, Big street 2-2",
                2312321,
                4.4);

        Employee employee = new Employee("Rob",
                "Peguet",
                "Riga, Beivibas iela 402-4",
                321321321,
                "Accountant");

        student.display();
        employee.display();
    }
}
