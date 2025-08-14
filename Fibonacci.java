import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        // fibo start from 0th position
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ther number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
