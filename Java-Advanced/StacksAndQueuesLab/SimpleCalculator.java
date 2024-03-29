package StacksAndQueuesLab;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String expression = scan.nextLine();
        String[] expressionParts = expression.split(" ");

        List<String> partsList = Arrays.asList(expressionParts);

        Collections.reverse(partsList);

        for (String part : partsList) {
            stack.push(part);
        }

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());
            int result = 0;
            switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                default:
                    System.out.println("Unknown operation" + op);
                    return;
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
