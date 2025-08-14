import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = sc.next();

            if (input.equals("x")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again.");
            }
        }

        System.out.println("Total sum is: " + sum);
    }
}

//
//  int num = Integer.parseInt(input);
// input is a String (e.g., "10" or "x").

// Integer.parseInt(input) tries to convert the string to an integer.

// If it’s a valid number (like "10"), it works.

// If it’s not (like "x" or "abc"), it throws an error → NumberFormatException.