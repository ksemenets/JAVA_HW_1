package org.example;
import java.util.Arrays;
public class part_2 {
    public static void main(String[] args) {
        int[]numbs = {1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1};
        int[]numbs2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] array = new int[6][6]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]

        System.out.println(Arrays.toString(changeArray(numbs)));
        System.out.println(Arrays.toString(changeArray2(numbs2)));
        System.out.println(Arrays.deepToString(changeArray3(array)));
    }
    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    //  С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static int[] changeArray(int[]numbs) {
        for(int i = 0; i< numbs.length; i ++){
            if(numbs[i] == 1){
                numbs[i] = 0;}
            else {
                numbs[i] = 1;
            }
        }
        return numbs;
    }


    // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;

    private static int[] changeArray2(int[]numbs2) {
        for(int i = 0; i< numbs2.length; i ++){
            if(numbs2[i] < 6){
                numbs2[i] *=2 ;}

        }
        return numbs2;
    }
    /* 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну
     *  из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     *  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    private static int[][] changeArray3(int[][] array) {
        for(int i = 0; i< array.length; i ++){
            for(int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (i + j == (array.length - 1)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }
}
