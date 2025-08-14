import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs: ");
        int runs = sc.nextInt();
        System.out.print("Enter number of innings: ");
        int innings = sc.nextInt();
        System.out.print("Enter times not out: ");
        int notOut = sc.nextInt();

        int outs = innings - notOut;
        double average = (outs == 0) ? runs : (double) runs / outs;

        System.out.println("Batting average = " + average);
    }
}

// So, if the player was never out, the batting average is just total runs.
// Otherwise, average = total runs divided by times out.

// Batting Average = Total Runs Scored / Number of Times Out
