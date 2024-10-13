package org.example;

import java.util.*;

public class PhoneStore {

    HashMap<Integer, Phone> phones = new HashMap<>();
    int id = 2;

    // БЫЛО УКРАДЕНО С StackOverflow ПОТОМУ ЧТО Я УМЕЮ СРАВНИВАТЬ ТОЛЬКО ОБЬЕКТЫ ЦЕЛИКОМ
    public boolean containsPhone(String vendor, String model) {
        return phones.values().stream()
                .anyMatch(phone -> phone.getVendor().equals(vendor) && phone.getModel().equals(model));
    }

    public void addNewPhone(Integer key, String vendor, String model, double price, String color) {
        Phone newPhone = new Phone(vendor, model, price, color);
        for (
                Map.Entry<Integer, Phone> entry : phones.entrySet()) {

            boolean containsPhoneResult = containsPhone(vendor, model);

            if (containsPhoneResult) {
                System.out.println("Данный товар уже есть в магазине");
            } else {
                phones.put(id, newPhone);
                System.out.println("Товар добавлен");
                id++;
            }
        }

    }

    public void showAllItems() {
        System.out.println(phones);
    }

    public void deleteObjects(Integer keyInput) {
        if (phones.containsKey(keyInput)) {
            phones.remove(keyInput);
            System.out.println("Товар успешно удален");
        } else {
            System.out.println("Товар не найден. Уточните номер товара в общем списке");
        }
    }

    public void sortBy (String sortType) {
        List<Map.Entry<Integer, Phone>> phonesList = new ArrayList<>(phones.entrySet());
        Comparator<vendor> comparator = Comparator.comparing(obj -> obj.getId());
        Collections.sort(phonesList, comparator);
    }

}

