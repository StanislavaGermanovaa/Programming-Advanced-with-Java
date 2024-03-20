package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            String command=scan.nextLine();

            if(command.startsWith("1")){
                int currentDigit=Integer.parseInt(command.split("\\s+")[1]);
                stack.push(currentDigit);

            }else if(command.equals("2")){
                if(!stack.isEmpty()) {
                    stack.pop();
                }

            }else if(command.equals("3")){
                if(stack.size()>0){
                    System.out.println(Collections.max(stack));
                }
            }


        }
    }

}
