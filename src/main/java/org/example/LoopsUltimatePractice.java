package org.example;

public class LoopsUltimatePractice {
    public static void main(String[] args) {
//        // задача 1
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
//        System.out.println(" Поехали! ");

//        // задача 2
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(" Тестовый пользователь № " + i);
//        }
//
//        // задача 3
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(" Четное " + i);
//            } else {
//                System.out.println(" Нечетное " + i);
//            }
//
//        }
//
//        // задача 4
//        for (int i = 1; i<=10; i++){
//            if (i == 3 || i == 7)
//                continue;
//            System.out.println("Тест " + i + " успешно выполнен");
//        }
//
//        // задача 5
//        for (int i = 1; i <= 20; i++){
//            System.out.println("Выполняется шаг № " + i);
//            if (i == 5)
//                break;
//        }
//        System.out.println("КРИТИЧЕСКИЙ БАГ! Останавливаем тест");
//
        // задача 6
        for (int i = 1; i <= 10; i++) {
            for (int b = 10; b >= 1; b--)
                System.out.println(i + "*" + b + "=" + (i * b ));
        }
    }
}

