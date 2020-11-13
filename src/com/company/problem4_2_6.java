package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem4_2_6 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        boolean repeat = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n----- MENU -----\nPress 1 for rotating 90 degree." +
                "\nPress 2 for rotating 180 degree\nPress 3 for rotating 270 degree.\nPress 4 to exit.");

        do {
            repeat = true;
            System.out.print("\nEnter here ---> ");
            int number = scanner.nextInt();

            switch (number) {
                case 1: {
                    System.out.println("90 degree clockwise rotation.\n");

                    for (int i = 0; i < matrix[0].length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            System.out.print(matrix[matrix.length - 1 - j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.println("180 degree clockwise rotation.\n");

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[0].length; j++) {
                            System.out.print(matrix[matrix.length - i - 1][matrix[0].length - 1 - j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    System.out.println("270 degree clockwise rotation.\n");

                    for (int i = 0; i < matrix[0].length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            System.out.print(matrix[j][matrix[0].length - 1 - i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Exit.");
                    break;
                }
                default: {
                    System.out.println("Invalid number. Please try again.");
                    repeat = false;
                    break;
                }
            }
        } while (!repeat);
    }
}