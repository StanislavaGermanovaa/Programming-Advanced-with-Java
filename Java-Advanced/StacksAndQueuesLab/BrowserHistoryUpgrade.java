package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String data = scan.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        while (!data.equals("Home")) {
            if (data.equals("back")) {
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");
                    data = scan.nextLine();
                    continue;
                }
                forwardHistory.push(history.peek());
                history.pop();
                System.out.println(history.peek());
            } else if (data.equals("forward")) {
                if (forwardHistory.size() < 1) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forwardHistory.peek());
                    history.push(forwardHistory.pop());
                }
            } else {
                history.push(data);
                System.out.println(history.peek());
            }
            data = scan.nextLine();
        }
    }
}

