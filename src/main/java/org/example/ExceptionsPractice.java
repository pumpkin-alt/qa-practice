package org.example;

public class ExceptionsPractice {
    public static void main(String[] args) {
//        int result = 0;
        try{
            int result  = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение работы");
        }

       try {checkUserAge(15);
       } catch (IllegalArgumentException e){
           System.out.println("Ошибка: " + e.getMessage());
       }

       try {
           int[] array = new int[3];
           array[4] = 3;
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Выход за границы массива");
       }



    }
    public static void checkUserAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("Возраст меньше 18");
        } else {
            System.out.println("Доступ разрешен");
        }
    }
}
