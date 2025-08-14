// Calculate Commission Percentage

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sales: ");
        double sales = sc.nextDouble();
        System.out.print("Enter commission %: ");
        double percent = sc.nextDouble();

        double commission = (percent / 100) * sales;
        System.out.println("Commission = " + commission);
    }
}

// Input: ₹10000, 5% → Output: ₹500

