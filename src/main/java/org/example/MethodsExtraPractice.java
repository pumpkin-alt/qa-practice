package org.example;

import java.nio.charset.StandardCharsets;

public class MethodsExtraPractice {
    public static void main(String[] args) {
        System.out.println(gradeForTests(100));

        separator("=", 4);

        System.out.println(indexFlaky(new String[]{"123123213: timeou1", "123123213: timeou11", "2414124141241: everybody"}));

        System.out.println(isCorrectPswd("1123@!#$$!@3"));

        System.out.println(generalPrice(new int[]{100, 200, 550, 216}));

        System.out.println(buildMaskToken("123123213"));
    }

    public static String gradeForTests(int points) {
        if (points >= 90 && points <= 100) {
            return "Отлично";
        } else if (points >= 75 && points <= 89) {
            return "Хорошо";
        } else if (points >= 50 && points <= 74) {
            return "Удовлетворительно";
        } else if (points < 50 && points >= 0) {
            return "Провал";
        } else {
            return "Неверный балл: " + points;
        }
    }

    public static void separator(String oneSymbol, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(oneSymbol);
        }
        System.out.println();
    }

    public static int indexFlaky(String[] testsResult) {
        for (int i = 0; i < testsResult.length; i++) {
            if (testsResult[i].contains("timeout")) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isCorrectPswd(String password) {
        if (password.length() >= 8 && password.length() <= 16 && !(password.contains(" "))){
            return true;
        }
        return false;
    }

    public static int generalPrice(int[] price) {
        int totalPrice = 0;
        for (int i = 0; i < price.length; i++) {
            totalPrice += price[i];
        }
        return totalPrice;
    }

    public static String buildMaskToken(String token){
      String builder = "";
      for (int i = 0; i < token.length() - 4; i++) {
          builder += "*";
      }
      return builder + token.substring(token.length() - 4, token.length());
    }
}


