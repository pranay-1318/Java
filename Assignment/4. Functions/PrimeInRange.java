import java.util.Scanner;

public class PrimeInRange {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for factors up to √num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime
            }
        }

        return true;
    }

    // Function to print all primes between two numbers
    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        printPrimesInRange(start, end);
    }
}
