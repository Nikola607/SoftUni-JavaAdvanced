package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        if(num==0){
            System.out.println(0);
        }

        while (num > 0) {
            deq.push(num % 2);
            num /= 2;
        }

        while (!deq.isEmpty()){
            System.out.print(deq.pop());
        }
    }
}
