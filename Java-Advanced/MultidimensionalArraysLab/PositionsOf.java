package MultidimensionalArraysLab;

import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputDimensions = scan.nextLine().split("\\s+");
        int row = Integer.parseInt(inputDimensions[0]);
        int cols = Integer.parseInt(inputDimensions[1]);

        int[][] matrix = new int[row][cols];

        for (int i = 0; i < row; i++) {
            String[] parts = scan.nextLine().split("\\s+");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        int search = Integer.parseInt(scan.nextLine());

        boolean isFound=false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == search) {
                    isFound=true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if(!isFound){
            System.out.println("not found");
        }
    }
}
