package MultidimensionalArraysLab;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

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
        int sum=0;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                sum+=matrix[i][j];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
