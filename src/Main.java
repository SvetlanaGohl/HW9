import java.util.MissingFormatArgumentException;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("ЗАДАЧА 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("ЗАДАЧА 2");
        int[] arr = generateRandomArray();
        int minExpense = 0;
        int maxExpense = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
        }
            System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей. Минимальная сумма трат за день составила " + minExpense + " рублей.");
        }

    public static void task3() {
        System.out.println("ЗАДАЧА 3");
        int[] arr = generateRandomArray();
        double averageSum = 0;
        double dayInMonth = 30;
        for (double element : arr) {
            averageSum = averageSum + element/dayInMonth;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");
    }
}



