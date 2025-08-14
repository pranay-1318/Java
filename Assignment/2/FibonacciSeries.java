// To calculate Fibonacci Series up to n numbers.
// 0, 1, 1, 2, 3, 5, 8, 13, 21
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;

        if (n == 0) {
            System.out.print("Fibonacci Series: " + a);
        } else if (n > 0) {

            System.out.print("Fibonacci Series: " + a + " " + b);
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
    }
}
