package org.example;

public class LoopPractice {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(" Попытка № " + i);
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Тест");
//        }
//        for (int i = 0; i <= 3; i++) {
//            System.out.println(" Попытка ввода пароля № " + i);
//        }
        //1 вариант
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(+i);
//            if (i == 1) {
//                System.out.println("Поехали");
//            }
//        }
        //2 вариант
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
//        System.out.println("Поехали");
        int passed = 0;
        int failed = 0;

        for (int i = 1; i<=10; i++){
            if (i % 2 == 0) {
                failed++;
                System.out.println(" Тест " + i + " упал ");
            } else {
                System.out.println(" Тест " + i + " пройден ");
                passed++;
            }
        }
        System.out.println(" Провалено: " + failed);
        System.out.println(" Успешно: " + passed);
    }
}