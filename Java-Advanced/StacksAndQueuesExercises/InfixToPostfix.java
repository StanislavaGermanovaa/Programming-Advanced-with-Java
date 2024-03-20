package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");
        ArrayDeque<String> operators = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String currentToken = tokens[i];

            switch (currentToken) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                case "(":
                    if (operators.isEmpty() || hasLowerPrecedence(operators.peek(), currentToken)) {
                        operators.push(currentToken);
                    } else {
                        while (!hasLowerPrecedence(operators.peek(), currentToken)) {
                            System.out.print(operators.pop() + " ");
                            if (operators.isEmpty()) {
                                break;
                            }
                        }
                        operators.push(currentToken);
                    }
                    break;
                case ")":
                    while (!operators.peek().equals("(")) {
                        System.out.print(operators.pop() + " ");
                    }
                    operators.pop();
                    break;
                default:
                    System.out.print(currentToken + " ");
            }
        }
        while (!operators.isEmpty()) {
            System.out.print(operators.pop() + " ");
        }
    }

    public static boolean hasLowerPrecedence(String current, String next) {
        int currentOperatorPrecedence = precedence(current);
        int nextOperatorPrecedence = precedence(next);

        if (currentOperatorPrecedence < nextOperatorPrecedence) {
            return true;
        } else if (currentOperatorPrecedence == nextOperatorPrecedence) {
            if (currentOperatorPrecedence == 3 || currentOperatorPrecedence == 4) {
                return true;
            } else {
                return false;
            }
        } else {
            if (currentOperatorPrecedence == 4) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int precedence(String operator) {
        int precedence = 0;
        if (operator.equals("+") || operator.equals("-")) {
            precedence = 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            precedence = 2;
        } else if (operator.equals("^")) {
            precedence = 3;
        } else if (operator.equals("(")) {
            precedence = 4;
        }

        return precedence;
    }
}
