// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        int result = product - sum;
        System.out.println("Result = " + result);
    }
}


//
// Input: 234
// Digits: 2, 3, 4
// Sum = 2 + 3 + 4 = 9
// Product = 2 * 3 * 4 = 24
// Output: 24 - 9 = 15