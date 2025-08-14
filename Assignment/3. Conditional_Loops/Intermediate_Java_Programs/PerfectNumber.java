public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28, sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (sum == num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");
    }
}

// A Perfect Number is a positive integer that is equal to the sum of its proper divisors, excluding itself.Let's find all divisors of 28 (excluding 28):

// Let's find all divisors of 28 (excluding 28):
// Divisors: 1, 2, 4, 7, 14
// 1 + 2 + 4 + 7 + 14 = 28