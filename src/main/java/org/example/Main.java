//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        PhoneStore phoneStore = new PhoneStore();

        Phone examplePhone = new Phone("Appe", "Iphone", 15.000, "Space kek");
        phoneStore.phones.put(1, examplePhone);

        int exit = 0;

        while (exit == 0) {
            System.out.println("Что вы хотите?");
            System.out.println("Введите <Добавить товар> для создания нового товара");
            System.out.println("Введите <Посмотреть все товары> чтобы просмотреть все товары");
            System.out.println("Введите <Удалить товар> чтобы удалить товар из магазина");
            System.out.println("Введите <Выйти> если вы хотите завершить работу");
            String command = scanner.nextLine();
            if (command.equals("Добавить товар")) {
                int keyInput = phoneStore.id;
                System.out.println("Введите производителя");
                String vendorInput = scanner.nextLine();
                System.out.println("Введите модель");
                String modelInput = scanner.nextLine();
                System.out.println("Введите стоимость (с точкой)");
                double priceInput = Double.parseDouble(scanner.next());
                System.out.println("Введите цвет (не обязательно)");
                String colorInput = scanner.nextLine();
                phoneStore.addNewPhone(keyInput, vendorInput, modelInput, priceInput, colorInput);
            } else if (command.equals("Удалить товар")) {
                System.out.println("Введите номер товара для удаления (можно посмотреть в общем списке товаров)");
                Integer keyInput = Integer.valueOf(scanner.nextLine());
                phoneStore.deleteObjects(keyInput);
            } else if (command.equals("Посмотреть все товары")) {
                phoneStore.showAllItems();
            } else if (command.equals("Выйти")) {
                System.out.println("До новых встреч!");
                exit++;
            }

//            System.out.println("\nВсе телефоны в магазине:");
//            HashMap<String, Phone> phones = phones.getPhones();
//            for (Map.Entry<String, Phone> entry : phones.entrySet()) {
//                System.out.println("Ключ: " + entry.getKey() + ", Телефон: " + entry.getValue());
////
////
//            else if (command.equals("все товары")) {
//                System.out.println(phoneStore.phones.toString());
//            } else if (command.equals("Отсортировать")) {
//                System.out.println("Введите метод сортировки: по производителю, по модели");
//                String modelInput = scanner.next();
//                    if (modelInput.equals("по производителю")) {
//                        A
//                    }

            }
        }
    }





