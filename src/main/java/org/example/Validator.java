package org.example;

public class Validator {
    public static void main(String[] args) {

        String login = "qa";
        String password = "1234";
        String confirmPassword = "12345678";
        String email = "ivan@gmail.ru";
        int age = 16;
        boolean isAgreed = false;
        boolean hasError = false;
//          Первый вариант
//        if (login.length() < 5) {
//            System.out.println("Ошибка: Логин должен быть не менее 5 символов");
//        } else if (password.length() < 8) {
//            System.out.println("Ошибка: Пароль должен быть не менее 8 символов");
//        } else if (password != confirmPassword) {
//            System.out.println("Ошибка: Пароли не совпадают");
//        } else if (!email.startsWith("qa_") || !email.endsWith("@mail.ru")) {
//            System.out.println("Ошибка: Некорректный email");
//        } else if (age < 18 ) {
//            System.out.println("Ошибка: Регистрация доступна только с 18 лет");
//        } else if (!isAgreed) {
//            System.out.println("Ошибка: Необходимо согласиться с правилами");
//        } else {
//            System.out.println("Регистрация успешна");
//        }
//          Второй вариант
//        if (login.length() < 5 || password.length() < 8 || password != confirmPassword || !email.startsWith("qa_") || !email.endsWith("@mail.ru") || age < 18 || !isAgreed) {
//            if (login.length() < 5) {
//                System.out.println("Ошибка: Логин должен быть не менее 5 символов");
//            } else {
//            }
//
//            if (password.length() < 8) {
//                System.out.println("Ошибка: Пароль должен быть не менее 8 символов");
//            } else if (password != confirmPassword) {
//                System.out.println("Ошибка: Пароли не совпадают");
//            } else {
//            }
//
//            if (password.equals(confirmPassword)) {
//                System.out.println("Ошибка: Пароли не совпадают");
//            } else {
//            }
//
//            if (!email.startsWith("qa_") || !email.endsWith("@mail.ru")) {
//                System.out.println("Ошибка: Некорректный email");
//            } else {
//            }
//
//            if (age < 18) {
//                System.out.println("Ошибка: Регистрация доступна только с 18 лет");
//            } else {
//            }
//
//            if (!isAgreed) {
//                System.out.println("Ошибка: Необходимо согласиться с правилами");
//            } else {
//            }
//        }
//         else {
//                    System.out.println("Регистрация успешна");
//                }


        // Третий тестик
//        if (login.length() < 5) {
//            System.out.println("Ошибка: Логин должен быть не менее 5 символов");
//            hasError = true;
//        }
//        if (password.length() < 8) {
//            System.out.println("Ошибка: Пароль должен быть не менее 8 символов");
//            hasError = true;
//        }
//        if (!password.equals(confirmPassword)) {
//            System.out.println("Ошибка: Пароли не совпадают");
//            hasError = true;
//        }
//        if (!email.startsWith("qa_") || !email.endsWith("@mail.ru")) {
//            System.out.println("Ошибка: Некорректный email");
//            hasError = true;
//        }
//
//        if (age < 18) {
//            System.out.println("Ошибка: Регистрация доступна только с 18 лет");
//            hasError = true;
//        }
//
//        if (!isAgreed) {
//            System.out.println("Ошибка: Необходимо согласиться с правилами");
//            hasError = true;
//        }
//        if (!hasError) {
//            System.out.println("Регистрация успешна");
//        }

        int statusCode = 2200;             //(сервер упал)
        double responseTimeMs = 100.5;   // (ответ шел слишком долго)
        String contentType = "application/json"; // (сервер отдал не JSON)
        int usersCount = 1;               // (список пользователей пустой)
        boolean isTokenValid = true;     // (токен авторизации протух)

        if (statusCode != 200) {
            System.out.println(" BUG: Ожидали 200, получили " + statusCode);
            hasError = true;
        }
        if (responseTimeMs >= 1000.0) {
            System.out.println(" BUG: Слишком долгий ответ сервера - " + responseTimeMs);
            hasError = true;
        }
        if (!contentType.equals("application/json")) {
            System.out.println(" BUG: Не верный формат. Ожидаем application/json. Получили - " + contentType);
            hasError = true;
        }
        if (usersCount <= 0) {
            System.out.println(" BUG: Список пользователей пуст ");
            hasError = true;
        }
        if (!isTokenValid) {
            System.out.println(" BUG: Токен авторизации невалиден (401) ");
            hasError = true;
        }
        if (!hasError) {
            System.out.println(" API Test PASSED. Ответ сервера полностью валиден. ");


        }
    }
}