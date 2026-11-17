package org.example;

public class LogicExtraPractice {
    public static void main(String[] args) {
        String login = "admin";
        String password = "12345";
        boolean isBlocked = true;
        int age = 20;
        boolean hasStudentCard = false;
        int statusCode = 500;
        int severity = 2;
        int priority = 3;
        String fileName = "photo.jpeg";
        int a = 4;
        int b = 3;
        int c = 50;


        if (login.equals("admin") && password.equals("12345") && !isBlocked)
            System.out.println("Доступ разрешен");
        else {
            System.out.println("Доступ запрещен");
        }

        if (age <= 18 || hasStudentCard)
            System.out.println("Скидка 10% предоставлена");
        else {
            System.out.println("Скидка не положена");
        }

        if (statusCode == 200)
            System.out.println("Ок: Запрос выполнен успешно");
        else if (statusCode == 201) {
            System.out.println("CREATED: обьект создан");
        } else if (statusCode == 400) {
            System.out.println("BAD REQUEST: Ошибка в запросе");
        } else if (statusCode == 401) {
            System.out.println("UNAUTHORIZED: Пользователь не авторизован");
        } else {
            System.out.println("UNKNOWN: Неизвестный код ответа");
        }


        if (priority == 1 && severity == 1)
            System.out.println("BLOCKER: Останавливаем релиз!");
        else if (priority == 1 || severity == 1)
            System.out.println("CRITICAL: Исправить в первую очередь");
        else {
            System.out.println("NORMAL: Обычный баг");
        }

        if (fileName.endsWith(".png") || fileName.endsWith(".jpeg") || fileName.endsWith(".jpg"))
        System.out.println("Файл принят");
        else{
            System.out.println("Не верный формат файла");
        }
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                System.out.println("Равносторонний");
            else if (a != b && b != c && b != a)
                System.out.println("Разносторонний");
            else {
                System.out.println("Равнобедренный");
            }
        }
        else {
            System.out.println("Это не треугольник");
            }
        }
    }

