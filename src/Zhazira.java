import java.util.Random;
import java.util.Scanner;
//
//public class Zhazira {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int generatedNumber = random.nextInt(1, 101);
//        while (true) {
//            int input = scanner.nextInt();
//            if (input == generatedNumber) {
//                break;
//            } else if (generatedNumber > input) {
//                System.out.println("Заданное число больше");
//            } else {
//                System.out.println("Заданное число меньше");
//            }
//        }
//
//    }
//}

//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите начальный диапозон: ");
//        int generationNumber = random.nextInt(5, 25);
//        scanner.nextInt();
//
//        System.out.println("Введите конечный диапозон: ");
//        int end = scanner.nextInt();
//
//        System.out.println("Сколько попыток хотите дать?: ");
//        int attempts = scanner.nextInt();
//
//        System.out.println("Угадайте число от 5 до 25: ");
//        scanner.nextInt();
//
//        for (int i = 1; i <= attempts ; i++) {
//            int attempt = scanner.nextInt();
//
//            while (true) {
//                int input = scanner.nextInt();
//                if (input == generationNumber) {
//                    break;
//                } else if (input > end) {
//                    System.out.println("Конечный диапозон превышен");
//                } else if (generationNumber < input) {
//                    System.out.println("Заданное число больше (осталось попыток " + (attempts-1) + ")");
//                } else {
//                    System.out.println("Заданное число меньше (осталось попыток " + (attempts-1) + ")");
//
//                }
//            }
//
//        }
//    }
//}
