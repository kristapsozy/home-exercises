package io.codelex.collections.examples.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private Map<String, String> data;
    private int dataCount;

    public PhoneDirectory() {
        data = new TreeMap<>();
        dataCount = 0;
    }

    private boolean find(String name) {
        if (data.containsKey(name)) {
            return true;
        }
        return false;
    }

    public String getNumber(String name) {
        if (find(name) == false) {
            return null;
        }
        return data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        PhoneEntry newEntry = new PhoneEntry();  // Create a new pair.
        newEntry.name = name;
        newEntry.number = number;
        data.put(name, number);
        dataCount++;
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "data=" + data +
                ", dataCount=" + dataCount +
                '}';
    }

    public Map<String, String> getData() {
        return data;
    }
}
