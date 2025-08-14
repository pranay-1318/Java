// Write a program to input principal, time, and rate (P, T, R) 
// from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float P = sc.nextFloat();
        System.out.print("Enter Time: ");
        float T = sc.nextFloat();
        System.out.print("Enter Rate: ");
        float R = sc.nextFloat();

        float SI = (P * T * R) / 100;
        System.out.println("Simple Interest = " + SI);
    }
}



// //

// Principal (P):
// The original amount of money that is borrowed or invested.
// Example: If you deposit ₹10,000 in a bank, that ₹10,000 is the principal.

// Time (T):
// The duration (usually in years) for which the money is borrowed or invested.
// Example: If you keep the money in the bank for 2 years, then T = 2.

// Rate (R):
// The percentage of interest charged on the principal per year.
// Example: If the bank gives 5% interest per year, then R = 5.

