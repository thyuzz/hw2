package org.example;

/**
 *  Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[] {25, -5, 6, 87, -7, 16, 15, -8, 0};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 9) & (arr[i] < 100)){ sum+=i; }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 0)){
                arr[i] = sum;
            }
            System.out.print(arr[i] + " ");
        }



    }
}