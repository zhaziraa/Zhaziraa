import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Random;
import java.util.Scanner;
//
//public class test {
//    public static void main(String[] args) {
//        int age = 30;
//        System.out.println("Алиби исполнится " +age+ " лет");

//    String name = "Hello";
//    String first = "World";
//        System.out.println(name + " " + first);

//        int FoodPrice = 8;
//        int bagPrice = 4;
//        int totalSum = FoodPrice* 5 + bagPrice * 8;
//        System.out.println(totalSum);

//        String weather = "солнечно";
//        int temperature = 25;
//        System.out.println("Сегодня " + weather);
//        System.out.println("Температура воздуха " + temperature + " градусов");

//        double tenges = 150002.7;
//              double rateUSD = 463.48;
//              double dollars = tenges / rateUSD;
//        System.out.println("У вас на счету " + 150002.7 + " тенге." + "В долларах это " + dollars + " долларов." + " Так держать!" );

//        int speed = 5;
//        if (speed == 0) {
//            System.out.println("Нет ветра");
//        } else if (speed == 5) {
//            System.out.println("Критичный ветер");
//        } else if (speed > 10) {
//        } else {
//            System.out.println("Есть ветер");
//
//        String weather = "Солнечная";
//        int temperature = 25;
//        if (temperature <= 25 && weather == "Солнечная") {
//            System.out.println("Погода хорошая, можно идти на пляж");
//        } else {
//            System.out.println("Неподходящая погода для пляжа");
//        }
//    }
//}

//        int x = 4;
//        boolean isNegative = x < 0;
//        System.out.println(isNegative);

//        int megabytes = 64000;
//        int gigabytes = 64;
//        int megabytesPerGigabytes = 1024;
//        int result = gigabytes * megabytesPerGigabytes;
//        boolean isMbMore = megabytes >= result;
//        System.out.println(isMbMore);

//        double rateUSD = 444.06;
//        double tenges = 124356.5;
//        if (rateUSD < 450) {
//            System.out.println("Отличный курс доллара - рекомендую купить!");
//        }
//        System.out.println("Ваши сбережения в долларах..." + tenges / rateUSD);


//        double rateUSD = 478.66;
//        double rateEUR = 507.59;
//        double tenges = 480000;
//        String currency = "USD";
//        System.out.println("Вы конвертируете тенге в " + currency);
//        if (currency == "USD"){
//            System.out.println("Ваши сбережения в долларах " + tenges / rateUSD);
//        } else if (currency == "EUR") {
//            System.out.println("Ваши сбережения в долларах " + tenges / rateEUR);
//        }

//        double purchase = 15000;
//        double user = purchase * 90 / 100;
//        System.out.println("Сумма с учетом 10% скидки составляет: " + user);
//        if (purchase > 1500) {
//            System.out.println("Скидка не доступна");
//        }
//    }
//}
//        int purchase = 15000;
//        int TotalSum = purchase * 90 / 100;
//        System.out.println("Сумма с учетом 10% скидки составляет: " + TotalSum);
//        if (TotalSum >= 10000) {
//            System.out.println("Скидка не доступна");
//        }
//            }

//        int a = 12;
//        int b = 4;
//        String sign = "/";
//        if (sign == "+") {
//            System.out.println(sign);

//        double purchase = 12000;
//        if (purchase >= 10000) {
//            double discount = 50;
//            if (discount < 5) (discount > 50);
//            System.out.println("Сумма с учетом 10% скидки составляет: " + purchase);
//            purchase -= purchase * 0.33;
//            System.out.println("Сумма с учетом 10% скидки составляет: " + purchase);
//        } else {
//            System.out.println("Скидка не доступна");

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Решаем задачу: " + i);
//        }
//        System.out.println("Задачи решены");
//    }
//}

//        System.out.println("Это первый этаж дома, который построил Джек");
//        for (int i = 10; i > 1; i--) {
//            System.out.println("А это " + i + " этаж, он на один выше чем этаж " + (i-1));

//        System.out.println("До старта Space Y осталось 70");
//        for (int i = 70; i >= 10; i--) {
//            System.out.println("До старта Space Y осталось " + (i - 7));
//
//        }
//    }
//}
//                    }
//        int secondsBeforeStart = 70;
//        for (secondsBeforeStart = 70; secondsBeforeStart >= 0; secondsBeforeStart -= 7) {
//            System.out.println("До старта SpaceY осталось " + secondsBeforeStart);
//        }
//        System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");
//    }
//}

//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("День " + i + "." + " Уже " + (i * 200) + " тенге.");
//        }
//    }
//}
//        java.util.Scanner scanner = new java.util.Scanner(System.in);

//        int number = scanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + number * i);
//        System.out.println("Введите три целых числа");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        if (a <= b && a <= c) {
//            System.out.println("Наименьшее число: " + a);
//        } else if (b <= c && b <= a) {
//                System.out.println("Наименьшее число: " + b);
//            } else {
//                System.out.println("Наименьшее число: " + c);

//        int floor = 10;
//        int flat = 5;
//        int counter = 0;
//        for (int i = 1; i <= floor; i++) {
//            for (int j = 1; j < flat; j++) {
//                int c = (i - 1) * floor + j;
//                counter += 1;
//                System.out.println("Этаж " + i + " квартира " + counter + " доставлен");
//
//


//        System.out.println("Введите количество ступенек: ");
//        int a = scanner.nextInt();
//        String b = "#";
//        for (int i = 0; i <= a; i++) {
//            b += "#";
//            System.out.println(b);
//        }
//    }
//        System.out.println("Введите общий выделенный бюджет: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите количество проектов: ");
//        int b = scanner.nextInt();
//        System.out.println("Введите стоимость бюджета проекта 1: ");
//        int c = scanner.nextInt();
//        int total = (a - c);
//        {
//            System.out.print("Проект 1 получил бюджет в размере " + c + " Бюджет: " + total);
//            {
//                System.out.println("Введите стоимость бюджета проекта 2: ");
//                    int d = scanner.nextInt();
//                    int total2 = (total - d);
//                    {
//                        System.out.println("Проект 2 получил бюджет в размере " + d + " Бюджет: " + total2);
//                        {
//                            System.out.println("Введите стоимость бюджета проекта 3: ");
//                            int e = scanner.nextInt();
//                            int total3 = (total2 - e);
//                            System.out.println("Проект 3 получил бюджет в размере " + e + " Бюджет: " + total3);
//                        }
//                        System.out.println("Введите стоимость бюджета проекта 4: ");
//                        int f = scanner.nextInt();
//                        System.out.println("Бюджет закончился, проект 4 не получил финансирование");


//        System.out.print("Введите начальный диапозон");
//        int anInt = scanner.nextInt(10);
//        System.out.print("Введите конечный диапозон");
//        int bInt = scanner.nextInt(30);
//        System.out.print("Сколько попыток хотите дать?");


//        Random random = new Random();
//        int generateNumber = random.nextInt(1, 20);
//        int attempts = random.nextInt(3);
//        while (true) {
//            System.out.println("Введите начальный диапозон: ");
//            int input = scanner.nextInt();
//            {
//                if (generateNumber == input);
//            }
//        }
//    }
//}
//        Random random = new Random();
//                Scanner scanner = new Scanner(System.in);





















