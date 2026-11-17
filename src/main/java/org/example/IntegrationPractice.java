package org.example;

public class IntegrationPractice {
    public static void main(String[] args) {

        String correctPassword = "secret123";
        int attempts = 3;
        int x = 5;
//        while (attempts > 0) {
//            if (attempts == 1) {
//                System.out.println("Доступ разрешен! Пароль верный.");
//                break;
//            } else {
//                System.out.println("Попытка входа. " + "Неверный пароль.");
//                attempts--;
//                System.out.println(" осталось попыток " + (attempts));
//            }
//        }
//        if (attempts == 0) {
//            System.out.println("Забанен");
//        }
//        System.out.println(x++ + ++x);

//        int grade = 95;
//        if (grade >= 90 && grade <= 100) {
//            System.out.println("Отлично");
//        } else if (grade >= 70 && grade <= 89) {
//            System.out.println("Хорошо");
//        } else if (grade >= 50 && grade <= 69) {
//            System.out.println("Удовлетворительно");
//        } else if (grade >= 0 && grade <= 49) {
//            System.out.println("Неудовлетворительно");
//        } else {
//            System.out.println("Некорректный балл");
//
//        }
        // 1 вариант
//        for (int i = 2; i <= 50; i += 2) {
//            System.out.print(i + " ");
//        }
//        // 2 вариант
//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//        }
//        System.out.print(sum);
//        int n = 5;
//        int result = 1;
//
//        for (int i = 1; i <= n; i ++) {
//            result = result * i;
//        }
//        System.out.print(result);

//        int number = 7;
//        int result = 0;
//        boolean isPrime = true;
//
//
//        if (number <= 1) {
//            System.out.print("Число не простое");
//        } else {
//            for (int i = 2; i <= number - 1; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print("Число простое");
//            } else {
//                System.out.print("Число не простое");
//            }
//        }
//        String even = "";
//        String odd = "";
//
//        for (int i = 1; i < 30; i++) {
//            if (i % 2 ==0)
//                even += i + " ";
//            else {
//                odd +=  i + " ";
//            }
//        }
//        System.out.print("Четные: " + even);
//        System.out.println();
//        System.out.print("Не четные: " + odd);

        // 1 вариант
//        System.out.print("И на 3 и на 5: ");
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print(i + "  ");
//            }
//        }
//        System.out.println();
//        System.out.print("На 3: ");
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        System.out.print("На 5: ");
//        for (int i = 1; i <= 50; i++) {
//            if (i % 5 == 0) {
//                System.out.print(i + " ");
//            }
//        }

        // 2 вариант
//        String three = "";
//        String five = "";
//        String theeAndFive = "";
//
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                theeAndFive += i + " ";
//             else if (i % 3 == 0)
//                three += i + " ";
//             else if (i % 5 == 0)
//                five += i + " ";
//            }
//
//        System.out.print("Делится на 3: " + three);
//        System.out.println();
//        System.out.print("Делится на 5: " + five);
//        System.out.println();
//        System.out.print("Делится на 3 и на 5: " + theeAndFive);

        // 3 вариант

//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + " - Делится и на 3 и на 5 ");
//            } else if (i % 3 == 0) {
//                System.out.println(i + " - Делится на 3");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " - Делится на 5");
//
//            }
//        }

        // вывод последней цифры числа
//        int number = 31212345;
//        int numberA = 0;
//        {
//            numberA += number % 10;
//            System.out.println(numberA);
//        }

//        int totalSecond = 3661;
//        int totalMinutes = 0;
//        int totalHour = 0;
//
//
//        totalMinutes =  (totalSecond / 60);
//        totalHour = totalMinutes / 60;
//        totalMinutes = totalMinutes % 60;
//        totalSecond = totalSecond % 60;
//
//
//        System.out.println("Часы: " + totalHour);
//        System.out.println("Минуты: " + totalMinutes);
//        System.out.println("Секунды: " + totalSecond);

//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0 && i % 3 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        int countChet = 0;
//        int contNeChet = 0;
//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                countChet++;
//            } else {
//                contNeChet++;
//            }
//        }
//        System.out.print("Четные: " + countChet);
//        System.out.println();
//        System.out.print("Не четные: " + contNeChet);

//        int january = 31;
//        int february = 28;
//        int march = 31;
//        int april = 30;
//        int may= 31;
//        int june = 30;
//        int july = 31;
//        int august = 31;
//        int september = 30;
//        int october = 31;
//        int november = 30;
//        int december = 31;

//        int numberMonth = 2;
//
//        switch (numberMonth) {
//            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
//            case 4, 6, 9, 11 -> System.out.println("30 дней");
//            case 2 -> System.out.println("28 дней");
//        }
//        int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.print(sum);

//        int number = 153;
//        int testNumberCount;
//        int testNumberSum;
//        boolean simpleNumber = true;
//        int sum = 0;
//        int countNumber = 0;
//        int lastNumber = 0;
//
//        // чет нечет
//        if (number % 2 == 0) {
//            System.out.print("Число - " + number + " четное");
//        } else {
//            System.out.print("Число - " + number + " нечетное");
//        }
//        // кол цифр и сумма
//        testNumberCount = number;
//         while (testNumberCount != 0) {
//            testNumberCount /= 10;
//            countNumber++;
//        }
//        System.out.println();
//        System.out.print("Колиество цифр в числе: " + number + " - " + countNumber);
//
//        testNumberSum = number;
//          while (testNumberSum > 0) {
//            sum = sum + testNumberSum % 10;
//              testNumberSum = testNumberSum / 10;
//        }
//        System.out.println();
//        System.out.print("Сумма цифр в числе: " + number + " - " + sum);
//
//        // простое сотавное
//        System.out.println();
//        if (number <= 1) {
//            System.out.print("Число - " + number + " Не простое и не составное");
//        } else {
//            for (int i = 2; i < number/2; i++) {
//                if (number % i == 0) {
//                    simpleNumber = false;
//                    break;
//                }
//            }
//        }
//        if (!simpleNumber) {
//            System.out.print("Число - " + number + " составное");
//        } else {
//            System.out.print("Число - " + number + " простое");
//        }
//        lastNumber = number % 10;
//        System.out.println();
//        System.out.print("Последняя цифра числа: " + number + " - " + lastNumber);
//
//        System.out.println();
//        switch (lastNumber) {
//            case 0, 5 -> System.out.print("Число заканчивается на 0 или 5");
//            case 2, 4, 6, 8 -> System.out.print("Число четное и не заканчивается на 0");
//            case 1, 3, 7, 9 -> System.out.print("Число нечетное");
//
//        }
        int number = 17;
        int whileCountSum = 0;
        int temporaryNumber;
        int whileCountNumber = 0;
        int мultiplicationNumber = 1;
        int firstNumber = 0;
        int lastNumber;
        boolean isSimple = true;

        // чет нечет
       if (number == 0) {
           System.out.println("Это число 0");
       }else if (number % 2 == 0) {
            System.out.println("Число - " + number + " четное");
        } else {
            System.out.println("Число - " + number + " не четное");
        }
        // Количесвто цифар
        temporaryNumber = number;
        if (temporaryNumber == 0) {
            System.out.println("Количество цифр - 1");
        } else {
            while (temporaryNumber != 0) {
                temporaryNumber /= 10;
                whileCountNumber++;
            }
            System.out.println("Количество цифр - " + whileCountNumber);
        }
        // сумма цифар
        temporaryNumber = number;
        if (temporaryNumber == 0) {
            System.out.println("Сумма цифр = 0");
        } else {

            while (temporaryNumber != 0) {
                whileCountSum = whileCountSum + temporaryNumber % 10;
                temporaryNumber /= 10;
            }
            System.out.println("Сумма цифр = " + whileCountSum);
        }

        // Произведенеи цифар
        temporaryNumber = number;
        if (temporaryNumber == 0) {
            System.out.println("Произведение цифр = 0");
        } else {

            while (temporaryNumber != 0) {
                мultiplicationNumber *= (temporaryNumber % 10);
                temporaryNumber /= 10;
            }
            System.out.println("Произведение цифр = " + мultiplicationNumber);
        }

        // простое чи не
        temporaryNumber = number;
        if (temporaryNumber == 0) {
            System.out.println("Число 0 это");
        } else {
            for (int i = 2; i <= temporaryNumber/2; i++) {
                if (temporaryNumber % i == 0) {
                    isSimple = false;
                    break;
                }
            }
        }
        if (!isSimple) {
            System.out.println("Число " + number + " составное");
        } else {
            System.out.println("Число " + number + " простое");
        }
        // первая цифра
        temporaryNumber = number;
        if (temporaryNumber == 0) {
            System.out.println("Первая цифра 0");
        } else {
            while (temporaryNumber != 0) {
                firstNumber = temporaryNumber % 10;
                temporaryNumber /= 10;
            }
            System.out.println("Первая цифра числа " + number + " - " + firstNumber);
        }

        // последняя цифра
        temporaryNumber = number;
        if (temporaryNumber == 0) {
            System.out.println("Последняя цифра 0");
        } else {
            lastNumber = temporaryNumber % 10;
            System.out.println("Последняя цифра числа " + number + " - " + lastNumber);
        }
        // свичу

        switch (firstNumber) {
            case 1, 2, 3 -> System.out.println("Число начинается с маленькой цифры");
            case 4, 5, 6 -> System.out.println("Число начинается со средней цифры");
            case 7, 8, 9 -> System.out.println("Число начинается с большой цифры");
            default -> System.out.println("Число начинается с 0");
        }
    }
}