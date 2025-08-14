import java.util.Scanner;

public class MaxTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Enter numbers (0 to stop):");
        int num = sc.nextInt();
        while (num != 0) {
            if (num > max) {
                max = num;
            }
            num = sc.nextInt();
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No input given.");
        } else {
            System.out.println("Maximum = " + max);
        }
    }
}
