package com.company;

import java.util.Random;

public class problem4_2_1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[10][15];
        int min = 100;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nThe minimum value is " + min);
    }
}