package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem4_2_2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[10][15];
        int rowSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[" + i + "] ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter the number of row: ");
        int rowNumber = scanner.nextInt();

        if (rowNumber > matrix.length - 1 || rowNumber < 0) {
            System.out.println("Invalid number.");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i == rowNumber) {
                        rowSum += matrix[rowNumber][j];
                    }
                }
            }
            System.out.println("The sum of the elements of row " + rowNumber + " is " + rowSum);
        }
    }
}