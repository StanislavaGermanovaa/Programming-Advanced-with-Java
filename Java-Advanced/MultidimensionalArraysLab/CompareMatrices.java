package MultidimensionalArraysLab;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] inputDimensions=scan.nextLine().split("\\s+");
        int firstRow=Integer.parseInt(inputDimensions[0]);
        int firstCols=Integer.parseInt(inputDimensions[1]);

        int[][] firstMatrix=new int[firstRow][firstCols];

        for(int i=0;i<firstRow;i++){
            String[] parts=scan.nextLine().split("\\s+");

            for(int j=0;j<firstCols;j++){
                firstMatrix[i][j]=Integer.parseInt(parts[j]);
            }
        }

        inputDimensions=scan.nextLine().split("\\s+");
        int secondRow=Integer.parseInt(inputDimensions[0]);
        int secondCols=Integer.parseInt(inputDimensions[1]);
        int[][] secondMatrix=new int [secondRow][secondCols];

        for(int i=0;i<secondRow;i++){
            String[] parts=scan.nextLine().split("\\s+");

            for(int j=0;j<secondCols;j++){
                secondMatrix[i][j]=Integer.parseInt(parts[j]);
            }
        }


        if(firstRow!=secondRow||firstCols!=secondCols){
            System.out.println("not equal");
            return;
        }

        for(int i=0;i<firstRow;i++){
            for(int j=0;j<firstCols;j++){
                if(firstMatrix[i][j]!=secondMatrix[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");
    }
}
