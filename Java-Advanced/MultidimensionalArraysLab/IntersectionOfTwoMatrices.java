package MultidimensionalArraysLab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        String[][] firstMatrix =new String[rows][cols];

        fillMatrix(firstMatrix,scan);

        String[][] secondMatrix = new String[rows][cols];
        fillMatrix(secondMatrix,scan);

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(firstMatrix[i][j].equals(secondMatrix[i][j])){
                    System.out.print(firstMatrix[i][j]+" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    private static void fillMatrix(String[][] matrix, Scanner scan) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().split("\\s+");
        }
    }
}


