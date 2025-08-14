// An Armstrong number (also known as a narcissistic number) is a number
// that is equal to the sum of its own digits each raised to the power of the
// number of digits.

// 1. 153  = 1^3 + 5^3 + 3^3
// 2. 9474 = 9^4 + 4^4 + 7^4 + 4^4

// Q :  find Armstrong Number between two given number

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int high = sc.nextInt();

        System.out.println("Armstrong numbers: ");
        for (int i = low; i <= high; i++) {
            int num = i, sum = 0, digits = 0;

            int temp = num;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print("  " + num);
            }
        }
    }
}
