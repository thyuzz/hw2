package org.example;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");
        int n = scanner.nextInt();
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < n-1; i++) {
            System.out.println();
            System.out.print("Введите следующее число: ");
            int num2 = scanner.nextInt();
            if (num1 < num2) {
                num1 = num2;
                k++;
            }
        }

        if (k == n-1) {System.out.println("Последовательность является возрастающей.");}
        else {System.out.println("Последовательность не является возврастающей.");}
    }
}