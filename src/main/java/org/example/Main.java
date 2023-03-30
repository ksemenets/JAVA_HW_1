package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        System.out.println(isLeapYear(2023));

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(Arrays.toString(createArray(5,  3)));

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
    }

    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b >= 10 & a + b <= 20) {
            return true;

        }
        return false;
    }

    private static boolean isPositive(int x) {
        if (x < 0) {
            return false;
        }
        return true;
    }

    private static void printString(String source, int repeat) {
        String new_str = "";
        // напечатать строку source repeat раз
        while (repeat > 0) {
            new_str += source;
            repeat--;
        }
        System.out.println(new_str);
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year % 4 == 0 & year % 100 == 0 & year % 400 == 0) {
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;

    }
}