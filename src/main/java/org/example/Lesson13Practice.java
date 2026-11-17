package org.example;

public class Lesson13Practice {
    public static void main(String[] args) {
        // 2
//        int [] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < numbers.length; i++)
//        System.out.print(numbers[i]);

        // 3
//        int[] numbers2 = {1, 2, 3, 4, 5, 6};
//        int sumArray = 0;
//
//        for (int i = 0; i < numbers2.length; i++) {
//            sumArray += numbers2[i];
//        }
//        System.out.println(sumArray);

        // 4
        int[] numbers3 = {101, 210, 30, 400, -100, 62};
        int minArray = numbers3[0];
        int maxArray = numbers3[0];

        for (int i = 0; i <= numbers3.length - 1; i++) {
             if (minArray > numbers3[i]) {
                minArray = numbers3[i];
            }
             if (maxArray < numbers3[i]) {
                maxArray = numbers3[i];
            }
        }
        System.out.println("Максимальное число в массиве - " + maxArray);
        System.out.println("Минимальное число в массиве - " + minArray);


        //5
//        int[] numbers4 = {1, 2, 3, 4, 5, 6, 6};
//        int countChet = 0;
//        int countNeChet = 0;
//        int arrowI = 0;
//
//        for (int i = 0; i < numbers4.length; i++) {
//            if (numbers4[i] % 2 == 0) {
//                countChet++;
//            } else {
//                countNeChet++;
//            }
//        }
//        System.out.println("Четных чисел в массиве - " + countChet);
//        System.out.println("Не четных чисел в массиве - " + countNeChet);

        //6
//        int[] numbers5 = {1, 2, 3, 4, 5, 6, 6};
//        for (int i = numbers5.length - 1; i >= 0 ; i--) {
//            System.out.print(" " + numbers5[i]);
//        }

        //7
//        int[] numbers6 = {1, 2, 3, 4, 5, 6, 6};
//        int number = 2;
//        boolean isItReally = false;
//
//        for (int i = 0; i < numbers6.length; i++) {
//            if (number == numbers6[i]) {
//               isItReally = true;
//               break;
//            }
//        }
//        if(isItReally) {
//            System.out.print("О да еврибади");
//        } else {
//            System.out.print("Гад дем не нашли");
//        }

        //homework1
//        int[] numbers7 = {1, 2, 3, 4, 5, 6, 6, -1, -2, -113};
//        for (int i = 0; i < numbers7.length; i++) {
//            if (numbers7[i] < 0) {
//                numbers7[i] = 0;
//            }
//            System.out.println(numbers7[i]);
//        }

        //homework1
//        double [] numbers8 = {1012, 76, 12, 34, 22};
//        double average = 0;
//
//        for (int i = 0; i <= numbers8.length - 1; i++){
//            average += numbers8[i];
//        }
//        average /= numbers8.length;
//        System.out.print(average);


    }
}
