package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int size=Integer.parseInt(scan.nextLine());

        int[][] matrix=new int [size][];

        for(int i=0;i<size;i++){
            String[] columnData=scan.nextLine().split(" ");

            int[] currentRow= Arrays.stream(columnData)
                    .mapToInt(elem -> Integer.parseInt(elem))
                    .toArray();

            matrix[i]=currentRow;
        }

        for(int i=0;i< matrix.length;i++){
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();

        for(int i=size-1, j=0;j<size;i--,j++){
            System.out.print(matrix[i][j]+" ");

        }
    }
}
