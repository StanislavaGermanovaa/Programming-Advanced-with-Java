package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        StringBuilder currentTest = new StringBuilder();
        ArrayDeque<String> textStack=new ArrayDeque<>();
        for (int commandNumber = 1; commandNumber <= n; commandNumber++) {
            String command = scan.nextLine();

            if (command.startsWith("1")) {
                textStack.push(currentTest.toString());

                String textToAppend = command.split("\\s+")[1];
                currentTest.append(textToAppend);
            } else if (command.startsWith("2")) {
                textStack.push(currentTest.toString());

                int count = Integer.parseInt(command.split("\\s+")[1]);
                int startIndexToDelete = currentTest.length() - count;
                currentTest.delete(startIndexToDelete, currentTest.length());
            } else if (command.startsWith("3")) {
                int position =Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentTest.charAt(position - 1));

            } else if (command.equals("4")) {
                if(!textStack.isEmpty()) {
                    String last = textStack.pop();
                    currentTest=new StringBuilder(last);
                }
            }
        }
    }
}
