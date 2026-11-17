package org.example;

public class LogicHardPractice {
    public static void main(String[] args) {
        String phoneNumber = "+79999999999";

        if (phoneNumber.startsWith("+7") && phoneNumber.length() == 12) {
            System.out.println("Номер валиден");
        } else {
            System.out.println("Не верный формат номера");
        }

        double orderAmount = 4999.99;

        if (orderAmount >= 5000) {
            System.out.println("Досьавка бесплатная");
        } else if (orderAmount >= 2000 && orderAmount < 5000) {
            System.out.println("Доставка 300р");
        }
        else {
            System.out.println("Доставка 500");
        }

        String userRole = "manager";
        boolean isSuperUser = false;

        if (userRole.equals("admin") || userRole.equals("manager") || !isSuperUser) {
            System.out.println("Доступ разрешён");
        }
        else {
            System.out.println("Доступ запрещён");
        }
        int severity = 2;
        boolean isRegression = false;

        if (severity == 1 && isRegression) {
            System.out.println("Приоритет: BLOCKER (Срочно!)");
        } else if (severity == 1) {
            System.out.println("Приоритет: CRITICAL");
        } else if (isRegression) {
            System.out.println("Приоритет: HIGH (Регресс)");
        } else {
            System.out.println("Приоритет: NORMAL");
        }


    }
}

