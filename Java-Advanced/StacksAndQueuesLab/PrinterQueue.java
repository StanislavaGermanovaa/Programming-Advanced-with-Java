package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String currentInput = scan.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!currentInput.equals("print")) {
            if (currentInput.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(currentInput);
            }

            currentInput = scan.nextLine();
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
