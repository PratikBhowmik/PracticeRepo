package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixTsum {
    static int matrixTSum(int n, int[][] matrix) {
        int rowSum = 0;
        int colSum = 0;
        int totalSum = 0;
        for (int i = 0; i < matrix[n].length; i++) {
            for (int j = 0; j < matrix[n].length; j++) {

            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column they will be always equal");
        int n = sc.nextInt();
        System.out.println("Enter data for the matrix");
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int tSum = matrixTSum(n, matrix);
        System.out.println(tSum);
    }
}
