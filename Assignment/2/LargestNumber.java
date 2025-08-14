import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is larger.");
        } else if (b > a) {
            System.out.println(b + " is larger.");
        } else {
            System.out.println("Both are equal.");
        }
    }
}


// int max = Math.max(a, b);

//   if (a == b) {
//      System.out.println("Both are equal.");
//   } else {
//       System.out.println(max + " is larger.");
//   }
