import java.util.Scanner;

public class FactorialProgram {

    // Method to calculate factorial
    public static int Factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i; // Multiply fact by i
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = Factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}
