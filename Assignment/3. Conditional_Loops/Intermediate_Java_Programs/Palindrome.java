public class Palindrome {
    public static void main(String[] args) {
        int num = 121, rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (rev == num)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }
}
