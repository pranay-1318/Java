// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (0 to stop):");
        int num = sc.nextInt();
        while (num != 0) {
            sum += num;
            num = sc.nextInt();
        }

        System.out.println("Sum = " + sum);
    }
}
