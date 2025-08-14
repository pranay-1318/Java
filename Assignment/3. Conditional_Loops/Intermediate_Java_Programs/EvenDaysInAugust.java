public class EvenDaysInAugust {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int count = 0;

        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }

        System.out.println("Kunal can go out on " + count + " days in August.");
    }
}
