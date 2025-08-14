// Calculate Distance Between Two Points

mport java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance = " + dist);
    }
}
