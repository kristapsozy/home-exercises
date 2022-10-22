package io.codelex.collections.examples.practice.phonebook;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.putNumber("John", "+37123213213");
        phoneDirectory.putNumber("Baba", "+37123232321");

        System.out.println(phoneDirectory);
        System.out.println(phoneDirectory.getData());
        System.out.println(phoneDirectory.getNumber("Baba"));

    }
}
