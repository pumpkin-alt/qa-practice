package org.example;

public class Lesson14Practice {
    public static void main(String[] args) {

        // z 1

//        String main = "  Java Programming  ";
//        System.out.println("До trim - " + main);
//        System.out.println("После trim - " + main.trim());
//        System.out.println("Строка в верхнем регистре - " + main.toUpperCase());
//        System.out.println("Строка в нижнем регистре - " + main.toLowerCase());
//        main = main.trim();
//        System.out.println("Превый и последний символ после trim " + main.charAt(0) + " и " + main.charAt(main.length() - 1));

        // z 2
//        String main2 = "I love Java and Selenium";
//        String submain = "python";
//
//        if (main2.contains("Java")) {
//            System.out.println("Строка содержит java");
//        } else {
//            System.out.println("Строка НЕ содержит java");
//        }
//
//       if (main2.toLowerCase().contains(submain.toLowerCase())) {
//           System.out.println("Строка содержинт - " + submain);
//       } else {
//           System.out.println("Строка НЕ содержинт - " + submain);
//       }
//        if (main2.startsWith("I love")){
//            System.out.println("Строка начинается с i love");
//        } else {
//            System.out.println("Строка НЕ начинается с i love");
//        }
//        if (main2.endsWith("ium")) {
//            System.out.println("Строка заканчивается на ium");
//        } else {
//            System.out.println("Строка НЕ заканчивается на ium");
//        }
//        System.out.println(main2.indexOf("Java"));

        // z 3
//
//        String name = "Hello World";
//
//        System.out.println(name.substring(6, 11));
//        System.out.println(name.replace("World", "Java"));
//        System.out.println(name.replace(" ", "_"));

        // z 4

        String fruits = "apple,banana,orange,grape";
        String[] fruitsArray = fruits.split(",");

        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        String name = "Hello";
        String nameTest = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            nameTest += name.charAt(i);
        }
        System.out.println(nameTest);


    }
}
