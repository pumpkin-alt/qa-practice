package org.example;

public class LogicPractice {
    public static void main(String[] args) {
        int balance = 250;
        int itemPrice = 200;
        if (balance >= itemPrice)
            System.out.println("Успешно");
        else {
            System.out.println("Нет денег нищуган");
        }

        // 1. Твоя проверка на баланс (if / else)
        // Используй System.out.println для вывода



        String expectedStatus = "PASS";
        String actualStatus = "PASS";
        if (expectedStatus.equals(actualStatus))
            System.out.println("Тест пройден");
        else {
            System.out.println("Не успешно");
        }

        // 2. Твоя проверка на статус (if / else) с использованием .equals()

    }
}