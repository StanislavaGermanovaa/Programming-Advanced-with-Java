package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        boolean flag = false;
        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                openBracketsStack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {

                if(openBracketsStack.isEmpty()){
                    flag=false;
                    break;
                }
                char lastOpenBracket = openBracketsStack.pop();
                if (lastOpenBracket == '(' && bracket == ')') {
                    flag = true;
                } else if (lastOpenBracket == '[' && bracket == ']') {
                    flag = true;
                } else if (lastOpenBracket == '{' && bracket == '}') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.printf("YES");
        }else {
            System.out.printf("NO");
        }
    }

}
