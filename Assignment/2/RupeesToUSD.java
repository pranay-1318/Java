// Input currency in rupees and output in USD (United States Dollar).
// 1 USD = 86.46 Indian Rupee

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        double usd = rupees / 86.46; 
        System.out.println("Amount in USD = $" + usd);
    }
}
