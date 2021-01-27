package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).
                toArray();

        if (array.length < 2) {
            System.out.println("Count = " + array.length);
            System.out.println("Sum = " + array[0]);
        } else {
            Function<String, Integer> function = e -> Integer.parseInt(e);
            int sum = 0;
            for (Integer s: array) {
                sum+=function.apply(s.toString());
            }
            System.out.println("Count = " + array.length);
            System.out.println("Sum = " + sum);
        }
    }
}
