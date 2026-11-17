package org.example;

public class MethodsPractice {
    public static void main(String[] args) {
        printTestCase();
        printTestCase();
        printTestCase();

        printUserInfo("Gay", 14);
        printUserInfo("lohh", 11);


        // boolean ifIhaveMoneyDobloeb = checkBalance(100, 1000);
        System.out.println("Хватает ли денег? " + checkBalance(100, 1000));

        System.out.println(getErrorMessage(300));

        int scores = countFailedTests(new int[] {1, 2, 3, 5, 6, 7, 8, 80, 90, 99});
        System.out.println(countFailedTests(new int[] {1, 2, 3, 5, 6, 7, 8, 80, 90, 99}));


    }

    public static void printTestCase() {
        System.out.println("Выполняется тест-кейс");
    }

    public static void printUserInfo(String name, int age) {
        System.out.println("Лох - " + name);
        System.out.println("Возраст - " + age);
    }

    public static boolean checkBalance(int balance, int price) {
        if (balance >= price) {
            return true;
        }
        return false;
    }

    public static String getErrorMessage(int code) {
        switch (code) {
            case 200, 201, 204 -> {
                return "ok";
            }
            case 400 -> {
                return "Bad pines";
            }
            case 500 -> { return "Server proebaly";}
            default -> {return "Hyi ego znaet";}
        }
    }

    public static int countFailedTests (int[] scores) {
        int countScore = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] < 70){
                countScore++;
            }
        }
        return countScore;
    }

}