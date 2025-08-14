import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        double sum = 0;

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }

        double avg = sum / n;
        System.out.println("Average = " + avg);
    }
}
