/**
 * Java 1. Homework #2.
 *
 * @author Mikhail Osetrov
 * @version 12.12.2021
 */

public class HomeWorkSecond {
    public static void main(String[]args) {
        System.out.println(checkSumRange(5, 10));
        System.out.println(checkSumRange(15, 10));
        System.out.println(checkSumRange(0, 5));
        transferIntegerNumber();
        System.out.println(transferIntNumber(1));
        System.out.println(transferIntNumber(0));
        System.out.println(transferIntNumber(-1));
        transferStringAndNumber("text", 5);
        System.out.println(yearLeap(2024));
    }

    static boolean checkSumRange(int a, int b) {
        int x = a + b;
        return 10 <= x && x <= 20;
    }

    static void transferIntegerNumber() {
        int a = -5;
        System.out.println((a >= 0) ? "Positive number" : "Negativ number");
    }

    static boolean transferIntNumber(int a) {
        if (a > 0) {
            return false;
        }
        return true;
    }

    static void transferStringAndNumber(String text, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("Word");
        }
    }

    static boolean yearLeap(int x) {
        if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)) {
            return true;
        }
        return false;
    }
}