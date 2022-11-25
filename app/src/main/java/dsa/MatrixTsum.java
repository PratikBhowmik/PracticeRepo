package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixTsum {
    static int matrixTSum(int n, int[][] matrix) {

        int rowSum = 0;
        int colSum = 0;
        for(int i = 0; i < n; i++){
            rowSum += matrix[0][i];
        }
        for (int i = 1; i < n; i++){
            colSum += matrix[i][n/2];
        }
        return rowSum+colSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns you want");
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
