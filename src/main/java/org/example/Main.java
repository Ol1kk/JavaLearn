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

        int exit = 0;

        while (exit == 0) {
            System.out.println("Что вы хотите?");
            System.out.println("Введите <Добавить товар> для создания нового товара");
            System.out.println("Введите <Все товары> чтобы просмотреть все товары");
            System.out.println("Введите <Выйти> если вы хотите завершить работу");
            String command = scanner.nextLine();
            if (command.equals("Добавить товар")) {
                System.out.println("Введите тип товара");
                String keyInput = scanner.next();
                System.out.println("Введите производителя");
                String vendorInput = scanner.next();
                System.out.println("Введите модель");
                String modelInput = scanner.next();
                System.out.println("Введите стоимость (с точкой)");
                Double priceInput = Double.valueOf(scanner.next());
                System.out.println("Введите цвет (не обязательно)");
                String colorInput = scanner.next();
                phoneStore.addNewPhone(keyInput, vendorInput, modelInput, priceInput, colorInput);
            } else if (command.equals("Выйти")) {
                System.out.println("До новых встреч!");
                exit++;
            }

            System.out.println("\nВсе телефоны в магазине:");
            HashMap<String, Phone> phones = phones.getPhones();
            for (Map.Entry<String, Phone> entry : phones.entrySet()) {
                System.out.println("Ключ: " + entry.getKey() + ", Телефон: " + entry.getValue());
//            
//            
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
}





