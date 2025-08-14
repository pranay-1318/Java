public class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0, 1 and negative numbers are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
        }

        return true; // Prime if no divisors found
    }

    public static void main(String[] args) {
        int num = 29;

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }
    }
}

// Example: Number = 36

// √36 = 6
// Factors: (2 × 18), (3 × 12), (4 × 9), (6 × 6)  // (9 x 4), (12 x 36), (18 x 2), (36 x 1),

// You can see:
// If 36 is divisible by 9 → the other divisor is 4
// If divisible by 12 → the other is 3

// So, we already catch the divisor before reaching 9 or 12
// That means, if 36 has a factor, we will find it before or at 6. No need to go beyond.

