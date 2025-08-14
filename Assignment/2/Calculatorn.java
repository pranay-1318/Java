import java.util.Scanner;

public class Calculatorn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            double ans = 0.0;

            if (op == '+') {
                ans = num1 + num2;
            } else if (op == '-') {
                ans = num1 - num2;
            } else if (op == '*') {
                ans = num1 * num2;
            } else if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                }
            } else if (op == '%') {
                ans = num1 % num2;
            } else {
                if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operation");
                }
            }
            System.out.println("Result: " + ans);
        }
    }
}
