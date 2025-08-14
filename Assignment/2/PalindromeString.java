// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // String reverse = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        // reverse += str.charAt(i);
        // }

        // if (str.equals(reverse)) {
        // System.out.println("The string is a Palindrome.");
        // } else {
        // System.out.println("The string is not a Palindrome.");
        // }

        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }
    }
}
