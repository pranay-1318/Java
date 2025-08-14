import java.util.Scanner;

public class PythagoreanTriplet {

    // Method to check Pythagorean triplet
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // First, sort the numbers to ensure c is the largest
        int x = Math.max(a, Math.max(b, c));
        int y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        // Check Pythagorean condition
        return x * x == y * y + z * z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("It is a Pythagorean triplet.");
        } else {
            System.out.println("It is NOT a Pythagorean triplet.");
        }
    }
}



// (a,b,c) is a Pythagorean triplet if:
// a² + b² = c²

// Enter three numbers: 3 4 5
// It is a Pythagorean triplet.

// Enter three numbers: 5 6 7
// It is NOT a Pythagorean triplet.