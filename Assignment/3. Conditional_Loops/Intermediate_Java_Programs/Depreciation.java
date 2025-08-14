import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double value = sc.nextDouble();
        System.out.print("Enter depreciation rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (years): ");
        int time = sc.nextInt();

        for (int i = 1; i <= time; i++) {
            value = value - (value * rate / 100);
        }

        System.out.println("Depreciated value = " + value);
    }
}
