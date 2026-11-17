package org.example;

import java.util.Locale;

public class MethodsFinalSprint {
    public static void main(String[] args) {

        System.out.println(getCountWords(new String[]{"TestTest", "testing", "code"}, "te"));

        System.out.println(calculateFactorial(10));

        System.out.println(isSortedAscending(new int[]{1}));

        System.out.println(powerOfTwo(3));

        System.out.println(sumRecursive(3));

        System.out.println(factorialRecursive(5));

        System.out.println(fibonacci(10));

//        System.out.println(reverseRecursive("Hello"));
//
        System.out.println(findFirstFailedTest(new boolean[]{true, false, false, false}));


    }

    public static int getCountWords(String[] arrayWords, String prefix) {
        int countWords = 0;
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].toLowerCase().startsWith(prefix.toLowerCase())) {
                countWords++;
            }
        }
        return countWords;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) return 1;
        if (n < 0) return -1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isSortedAscending(int[] numbers) {
        if (numbers.length <= 1) return true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) return false;
        }
        return true;
    }

    public static int powerOfTwo(int n) {
        if (n == 0) return 1;
        return 2 * powerOfTwo(n - 1);

    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int factorialRecursive(int n) {
        if (n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

//    public static String reverseRecursive(String text) {
//        String lastChar = "";
//        String restOfString = "";
//        if (text.isEmpty()) return "";
//        lastChar = text.substring(text.length() - 1, "");
//
//        return
//    }

    public static int findFirstFailedTest(boolean[] testResults) {
        if (testResults.length == 0) return -1;
        for (int i = 0; i < testResults.length; i++) {
            if (!testResults[i]) return i;
        }
        return -1;
    }


}
