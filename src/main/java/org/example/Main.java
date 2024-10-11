//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Store currentStore = new Store();
        currentStore.phones.add(new Phone("Apple", "Iphone", 25.5));
        Scanner scanner = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("Что вы хотите?");
                System.out.println("Введите <добавить товар> для создания нового товара");
                System.out.println("Введите <все товары> чтобы просмотреть все товары");
                String command = scanner.nextLine();
                if (command.equals("добавить товар")) {
                    System.out.println("Введите производителя");
                    String vendorInput = scanner.next();
                    System.out.println("Введите модель");
                    String modelInput = scanner.next();
                    System.out.println("Введите стоимость (с точкой)");
                    Double priceInput = Double.valueOf(scanner.next());
                    currentStore.createNewPhone(vendorInput, modelInput, priceInput);
                } else if (command.equals("все товары")) {
                    System.out.println(currentStore.phones.toString());
                }
            }
        }
    }
}
