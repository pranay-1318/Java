// Calculate Discount Of Product
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount %: ");
        double discount = sc.nextDouble();

        double amount = price * (1 - discount / 100);  //  price - (price * discout /100)
        System.out.println("Price after discount = " + amount);
    }
}
