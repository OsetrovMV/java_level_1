/**
 * Java 1. Homework #3.
 *
 * @author Mikhail Osetrov
 * @version 14.12.2021 - 15.12.2021
 */
import java.util.Arrays;

public class HomeWorkThird {
    public static void main(String[] args) {
        changingNumber();
        System.out.println("\nfillingValues: ");
        fillingValues();
        System.out.println("\nmultiplicationNumbers: ");
        multiplicationNumbers();
        System.out.println("\nisTwoDimensionalArray: ");
        isTwoDimensionalArray();
        System.out.println("isTwoDimensionalArray: ");
        acceptsTwoElements(3, 8);
    }

    static void changingNumber() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
            System.out.print(numbers[i] + " ");
        }
    }

    static void fillingValues() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    static void multiplicationNumbers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] *2;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    static void isTwoDimensionalArray() {
        int[] [] arr = {{9, 2, 0}, {4, 6, 0}, {8, 0, 3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr [i][j] = 1;
                }
            System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }

    static int [] acceptsTwoElements(int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len; i++) {
            arr [i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
    } 
}