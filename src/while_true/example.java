//package while_true;
//
//import java.util.Random;
//
//public class example {
//    public static void main(String[] args) {
//        Random random = new Random();
//
//        while (true) {
//            int randomNumber = random.nextInt(10) + 1;
////            random.nextInt(10) + 1 означает генерацию случайного числа в диапазоне от 1 до 10 включительно.
////            random.nextInt(10) генерирует случайное число от 0 до 9, и прибавление +1 смещает результат на 1,
////            получая числа от 1 до 10.
//            System.out.println("Сгенерировано число: " + randomNumber);
//
//            if (randomNumber == 7) {
//                System.out.println("Число 7 сгенерировано. Программа завершена.");
//                break; // выход из бесконечного цикла при генерации числа 7
//            }
//        }
//    }
//}
//Сгенерировано число: 1
//Сгенерировано число: 8
//Сгенерировано число: 4
//Сгенерировано число: 9
//Сгенерировано число: 3
//Сгенерировано число: 10
//Сгенерировано число: 5
//Сгенерировано число: 10
//Сгенерировано число: 4
//Сгенерировано число: 7
//Число 7 сгенерировано. Программа завершена.