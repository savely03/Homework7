public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 7");
        tasks1_2_3_4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void tasks1_2_3_4() {
        System.out.println("Task1:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(" " + i);
        }

        System.out.println("Task2:");
        for (int i = 10; i > 0; i--) {
            System.out.println(" " + i);
        }

        System.out.println("Task3:");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + i);
            }
        }

        System.out.println("Task4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(" " + i);
        }
    }

    public static void task5() {
        System.out.println("Task5:");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(" " + i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Task6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(" " + i);
        }
    }

    public static void task7() {
        System.out.println("Task7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(" " + i);
        }
    }

    public static void task8() {
        System.out.println("Task8:");
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += 29000;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Task9:");
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += 29000;
            total += total * 0.01;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task10() {
        System.out.println("Task10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(" 2*" + i + "=" + 2 * i);
        }
    }
}