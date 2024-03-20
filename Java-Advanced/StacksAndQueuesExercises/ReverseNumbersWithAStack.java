package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();

        for(int i=0;i< data.length;i++){
            numbers.push(data[i]);
        }


        while (!numbers.isEmpty()){
            System.out.print(numbers.pop()+" ");
        }
    }
}
