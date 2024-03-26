package MultidimensionalArraysLab;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputDimensions = scan.nextLine().split(",\\s+");
        int rows = Integer.parseInt(inputDimensions[0]);
        int cols = Integer.parseInt(inputDimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] parts = scan.nextLine().split(",\\s+");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }
        int maxSumTopLeftRow=-1;
        int maxSumTopLeftCol=-1;
        int maxSum = 0;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[0].length-1; j++) {

                int currentSum = matrix[i][j] + matrix[i][j + 1]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    maxSumTopLeftRow=i;
                    maxSumTopLeftCol=j;
                }
            }
        }

        System.out.println(matrix[maxSumTopLeftRow][maxSumTopLeftCol]+" "+matrix[maxSumTopLeftRow][maxSumTopLeftCol+1]);
        System.out.println(matrix[maxSumTopLeftRow+1][maxSumTopLeftCol]+" "+matrix[maxSumTopLeftRow+1][maxSumTopLeftCol+1]);
        System.out.println(maxSum);
    }
}
