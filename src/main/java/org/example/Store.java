//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.ArrayList;

public class Store {
    ArrayList<Phone> phones = new ArrayList();

    public Store() {
    }

    public void createNewPhone(String vendor, String model, Double price) {
        Phone temporaryPhone = new Phone(vendor, model, price);
        int phoneCapacity = this.phones.size();

        for(int i = 0; i < phoneCapacity; ++i) {
            Phone phoneObj = (Phone)this.phones.get(i);
            if (phoneObj.equals(temporaryPhone) || phoneObj.hashCode() == temporaryPhone.hashCode()) {
                System.out.println("Данный товар уже существует.");
                break;
            }

            this.phones.add(temporaryPhone);
            System.out.println("Товар добавлен успешно!");
        }

    }
}
