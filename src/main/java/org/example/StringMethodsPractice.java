package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringMethodsPractice {
    public static void main(String[] args) {

        // z 1

//        String url = "https://api.sber.ru/v1/users";
//
//        System.out.println(url.length());
//        System.out.println(url.charAt(8));
//        System.out.println(url.substring(url.length() - 5, url.length()));

        // z 2

//        String email = " TestUser@Mail.RU ";
//
//        email = email.trim();
//        email = email.toLowerCase();
//        if ( email.endsWith("@mail.ru")) {
//            System.out.println("email - " + email + " валидный");
//        } else {
//            System.out.println("email - " + email + " НЕ валидный");
//        }

        // z 3

//        String log = "Error 500: Internal Server Error. Please contact support.";
//        int indexlog = log.indexOf("Server");
//        boolean containsError = false;
//
//        if (log.contains("Error")) {
//            containsError = true;
//        }
//        log = log.replace("support", "administrator");
//        if (containsError) {
//            System.out.println("Индекс слова Server - " + log.indexOf("Server"));
//            System.out.println("Error!!!");
//            System.out.println(log);
//        } else {
//            System.out.println("Индекс слова Server - " + log.indexOf("Server"));
//            System.out.println("Ошибок нет");
//            System.out.println(log);
//        }
//
//        // z 4
//
//        String userData = "ivan_qa;password123;admin";
//        String[] userDataArray = userData.split(";");
//        System.out.println(userDataArray[1]);
//
//        // z 5
//
//        String[] fileName = {"image.png", "document.pdf", "photo.JPG", "video.mp4", "avatar.png"};
//
//        for (int i = 0; i < fileName.length; i++) {
//            if (!fileName[i].endsWith(".png")) {
//                System.out.println(fileName[i] + " Эт не картинка");
//            }
//
//
//        }

//        String password = "myp_password @123";
//        boolean isError = false;
//
//
//        if (!(password.equals(password.trim())) || !(password.equals(password.replace(" ", "")))) {
//      //      System.out.println("В пароле не должно быть пробелов");
//            isError = true;
//        }
//        if (password.length() < 8 || password.length() > 20) {
//     //       System.out.println("Пароль меньше 8 или больше 20 символов");
//            isError = true;
//        }
//        if (!password.contains("@") && !password.contains("_") ) {
//    //        System.out.println("В пароле должен присутствовать @ или _ ");
//            isError = true;
//        }
//        if (isError) {
//            System.out.println("Пароль не валиден");
//        } else {
//            System.out.println("Пароль валиден");
//        }

        // z 2
        String log = "[ERROR] 2023-10-25 14:30:00 User: admin_qa Status: 500";
        String[] logArray = log.split(" ");

        logArray[0] = logArray[0].replace("[", "");
        logArray[0] = logArray[0].replace("]", "");
        System.out.print(logArray[0] + " " + logArray[4] + " " + logArray[6]);

        // z 3
        String[] urls = {"https://api.sber.ru/v1/users", "http://test.ru/api", "https://api.sber.ru/v1/cards", "ftp://files.ru"};

        for (int i = 0; i < urls.length; i++) {
            if (urls[i].startsWith("https://") && urls[i].contains("api") && (urls[i].endsWith("users") || (urls[i].endsWith("cards")))) {
               System.out.println("Валидный url: " + urls[i]);
            } else {
                System.out.println("Ошибка в url: " + urls[i]);
            }
        }


    }
}
