package org.example;

import java.util.Locale;

public class SwitchPractice {
    public static void main(String[] args) {

        int number = 5;

        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Не день недели");
        }

//        String grade = "4";
//
//        switch (grade) {
//            case "1" -> System.out.println("Очень плохо");
//            case "2" -> System.out.println("Неудовлетворительно");
//            case "3" -> System.out.println("Удовлетворительно");
//            case "4" -> System.out.println("Хорошо");
//            case "5" -> System.out.println("Отлично");
//            default -> System.out.println("Некорректная оценка");
//        }

//        String browser = "FIREFOX";
//
//        switch (browser.toLowerCase()) {
//            case "chrome" -> System.out.println("Запускаем ChromeDriver");
//            case "firefox" -> System.out.println("Запускаем GeckoDriver");
//            case "edge" -> System.out.println("Запускаем EdgeDriver");
//            case "safari" -> System.out.println("Запускаем SafariDriver");
//            default -> System.out.println("Браузер не поддерживается");
//        }
//        int severity = 2;
//
//        switch (severity) {
//            case 1 -> System.out.println("Critical — нужно чинить в первую очередь");
//            case 2 -> System.out.println("Major — важно, но не блокирует");
//            case 3 -> System.out.println("Minor — можно отложить");
//            case 4 -> System.out.println("Trivial — косметика");
//            default -> System.out.println("Неизвестный приоритет");
//        }
//        int numberMonth = 12;
//
//        switch (numberMonth) {
//            case 12, 1, 2 -> System.out.println("Зима");
//            case 3, 4, 5 -> System.out.println("Весна");
//            case 6, 7, 8 -> System.out.println("Лето");
//            case 9, 10, 11 -> System.out.println("Осень");
//        }


    }
}
