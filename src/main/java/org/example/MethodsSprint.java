package org.example;

public class MethodsSprint {
    public static void main(String[] args) {

        printTestReport(200, 0);

        System.out.println(isValidIp("..12311111111."));

        System.out.println(findSlowestResponseIndex(new int[] {}));

        System.out.println(reverseText("Здарова"));

        System.out.println(calculateAverageTime(new int[] {161, 23, 15, 2000}));



    }
    public static void printTestReport(int finishTests, int errorTests){
        if (errorTests == 0){
            System.out.println("Релиз готов! Все " + finishTests + " тестов пройдены.");
        } else if (errorTests > 0 && errorTests <= finishTests){
            System.out.println("Внимание! Провалено тестов: " + errorTests + " Релиз не готов.");
        } else {
                System.out.println("Ошибка, количество проваленых кейсов не может быть больше их общего числа!");
            }
    }

    public static boolean isValidIp(String ip) {
        int dotsCount = ip.length() - ip.replace(".", "").length();
        return dotsCount == 3 && ip.length() <= 15 && ip.length() >= 7;

    }

    public static int findSlowestResponseIndex(int[] apiResponses){
        if (apiResponses.length == 0) return -1;
        int index = 0;
        int maxTime = apiResponses[0];
        for (int i = 1; i < apiResponses.length; i++) {
            if (apiResponses[i] > maxTime) {
                maxTime = apiResponses[i];
                index = i;
            }
        } return index;
    }

    public static String reverseText(String text){
        if (text == null || text.isEmpty()) return "";
      String result = "";
        for (int i = text.length() - 1; i >= 0; i--){
            result += text.charAt(i);
        }
        return result;
    }

    public static double calculateAverageTime (int[] requestsTime) {
        if (requestsTime.length <= 1) return 0.0;
        double maxTime = requestsTime[0];
        double average = 0;
        double sumTime = 0;
        for (int i = 0; i < requestsTime.length; i++){
            if (maxTime < requestsTime[i]){
                maxTime = requestsTime[i];
            }
            sumTime += requestsTime[i];
        }
       average = (sumTime - maxTime) / (requestsTime.length - 1);
        return  average;
    }
}
