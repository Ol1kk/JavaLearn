package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneStore {

    public void addNewPhone(String key, String vendor, String model, double price, String color) {
    HashMap<String, Phone> phones = new HashMap<>();
//        phones.put("First", new Phone("Apple", "iPhone", 24.10, "black"));
//        phones.put("Second", new Phone("Samsung", "Galaxy", 24.10, "black"));
//        phones.put("Third", new Phone("Samsung", "Galaxy", 24.10, "black"));

    //HashSet<Phone> one = new HashSet<Phone>();
        Phone newPhone = new Phone(vendor, model, price, color);

        for (
        Map.Entry<String, Phone> entry : phones.entrySet()) {
        String valueKey = entry.getKey();
        Phone valuePhone = entry.getValue();
        // System.out.println("Key: " + key + ", Value: " + value);
        if (phones.containsKey(valuePhone)) {
            System.out.println("Данный товар уже есть в магазине");
        } else {
            phones.put(key, valuePhone);
            System.out.println("Товар добавлен");
        }
    }


}
}

