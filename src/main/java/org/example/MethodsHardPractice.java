package org.example;

public class MethodsHardPractice {
    public static void main(String[] args) {

        String getTestStatus = getTestStatus(0, 12);
        System.out.println(getTestStatus);

        System.out.println(getLog("Траливали"));
        System.out.println(getLog("Проиграли", 101));

        int countValidMail = countValidMail(new String[]{"123123@mail.ru", "123123", "123123@mail.ru", "1144223@gmail.ru",});
        System.out.println(countValidMail);

        System.out.println(sale(900, "Йогурт"));

        System.out.println(chekUrl("https://chat.deepseek.com/a/chat/s/7885644a-af93-4f0f-8d39-65d1c56d1bfc"));
    }

    public static String getTestStatus(int passedCount, int totalCount) {
        if (passedCount == totalCount) {
            return "PASSED";
        } else if (passedCount == 0) {
            return "FAILED";
        } else {
            return "PARTIAL";
        }
    }

    public static String getLog(String message) {
        return "LOG: " + message;
    }

    public static String getLog(String message, int code) {
        return "LOG [" + code + "]: " + message;
    }

    public static int countValidMail(String[] email) {
        int count = 0;
        for (int i = 0; i < email.length; i++) {
            if (email[i].contains("@mail.ru")) {
                count++;
            }
        }
        return count;
    }

    public static double salePrice(double price) {
        price = (price * 0.9);
        return price;
    }

    public static String sale(double price, String name) {
        price = salePrice(price);
        return "Товар: " + name + ", " + " Цена со скидкой: " + price;
    }

    public static boolean chekUrl(String url) {
        boolean isValidUrl = false;
        if (url.startsWith("https://") && url.contains(".") && url.length() > 10) {
            isValidUrl = true;
            return isValidUrl;
        } else {
            return isValidUrl;
        }
    }
}
