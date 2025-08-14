import java.util.*;

class SLuckyN {

    public static void main(String[] args) {

        int[][] matrix = { { 3, 6 }, { 7, 1 }, { 5, 2 }, { 4, 8 } };

        // int maxc = matrix[3][0];
        //     for (int j = 0; j < matrix.length; j++) {
        //         maxc = Math.max(maxc, matrix[j][0]);
        //     }
        // System.out.println(maxc);

    
        List<Integer> result = luckyNumbers(matrix);

        System.out.println(result);
    }

    static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            int minr = Integer.MAX_VALUE;
            int minIdx = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                // minr = Math.min(minr, matrix[i][j]);

                if (matrix[i][j] < minr) {
                    minr = matrix[i][j];
                    minIdx = j;
                }
            }

            int maxc = matrix[i][minIdx];
            for (int j = 0; j < matrix.length; j++) {
                maxc = Math.max(maxc, matrix[j][0]);
            }

            if (maxc == matrix[i][minIdx]) {
                arr.add(matrix[i][minIdx]);
                break; // break the for loop
            }

        }
        return arr;
    }
}