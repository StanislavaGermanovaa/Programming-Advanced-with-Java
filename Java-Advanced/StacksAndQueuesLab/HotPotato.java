package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split("\\s+");
        int steps=Integer.parseInt(scan.nextLine());

        ArrayDeque<String> kids = new ArrayDeque<>();
        Collections.addAll(kids,names);

        while (kids.size()>1){
            for(int i=0;i<steps-1;i++){

                String kid=kids.poll();
                kids.offer(kid);
            }
            String removedChild=kids.poll();
            System.out.println("Removed " + removedChild);
        }
        System.out.println("Last is "+kids.poll());
    }
}
