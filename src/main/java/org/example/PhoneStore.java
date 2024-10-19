package org.example;

import java.util.*;

public class PhoneStore {

    HashMap<Integer, Phone> phones = new HashMap<>();
    int id = 2;

  //   БЫЛО УКРАДЕНО С StackOverflow ПОТОМУ ЧТО Я УМЕЮ СРАВНИВАТЬ ТОЛЬКО ОБЬЕКТЫ ЦЕЛИКОМ
    public boolean containsPhone(String vendor, String model) {
        return phones.values().stream()
                .anyMatch(phone -> phone.getVendor().equals(vendor) && phone.getModel().equals(model));
    }


    public void addNewPhone(Integer key, String vendor, String model, double price, String color) {
        Phone newPhone = new Phone(vendor, model, price, color);

        if (containsPhone(vendor, model)) {
            System.out.println("Данный товар уже есть в магазине");
        } else {
            phones.put(id, newPhone);
            System.out.println("Товар добавлен");
            id++;
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

    public void sortByPrice() {
        List<Map.Entry<Integer, Phone>> phoneList = new ArrayList<>(phones.entrySet());

        phoneList.sort(Comparator.comparingDouble(entry -> entry.getValue().getPrice()));


        HashMap<Integer, Phone> sortedByPrice = new LinkedHashMap<>();
        for (Map.Entry<Integer, Phone> entry : phoneList) {
            sortedByPrice.put(entry.getKey(), entry.getValue());
        }

        sortedByPrice.forEach((key, value) ->
                System.out.println("id: " + key + ", Телефон: " + value));
    }


    public void sortByVendor() {
        List<Map.Entry<Integer, Phone>> phoneList = new ArrayList<>(phones.entrySet());

        phoneList.sort(Comparator.comparing(entry -> entry.getValue().getVendor()));

        HashMap<Integer, Phone> sortedByVendor = new LinkedHashMap<>();
        for (Map.Entry<Integer, Phone> entry : phoneList) {
            sortedByVendor.put(entry.getKey(), entry.getValue());
        }

        sortedByVendor.forEach((key, value) ->
                System.out.println("id: " + key + ", Телефон: " + value));
    }

    public void getPHones(String vendor) {
        List<Phone> phonesByVendor = new ArrayList<>();

        for (Map.Entry<Integer, Phone> entry : phones.entrySet()) {
            if (entry.getValue().getVendor().equalsIgnoreCase(vendor)) {
                phonesByVendor.add(entry.getValue());
            }
        }

        System.out.println(phonesByVendor);
    }

    public void getPhones(String vendor, String model) {
        for (Map.Entry<Integer, Phone> entry : phones.entrySet()) {
            Phone phone = entry.getValue();
            if (phone.getVendor().equalsIgnoreCase(vendor) && phone.getModel().equalsIgnoreCase(model)) {
                System.out.println(phone);
            }
        }
    }
}

