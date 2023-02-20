package org.example;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");
        int n = scanner.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Введите целое число: ");
            int num = scanner.nextInt();
            if (((num == 2) || (num == 3) || (num == 5) || (num == 7)) || ((num != 1) && (num % 2 != 0) && (num % 3 != 0) && (num % 5 != 0) && (num % 7 != 0))){
                sum = sum + num;
            }
        }

        System.out.println(sum);

    }
}