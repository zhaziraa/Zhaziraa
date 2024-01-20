package fori;

public class example {
    public static void main(String[] args) {
        int number = 5;

// number - число, для которого мы хотим вывести таблицу умножения (в данном случае, 5).
//        fori используется для итерации от 1 до 10.
//        Внутри цикла производится умножение number на текущее значение i, и результат выводится на экран.

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
// Результат:
// 5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45
//5 * 10 = 50