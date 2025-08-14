import java.util.Arrays;

public class SortedMatrix {  // same row same column
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },    // 
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        System.out.println(Arrays.toString(search(arr, 9)));
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // This returns the number of columns in the first row of the array.

        if (cols == 0) {
            return new int[] { -1, -1 };
        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {

            int mid = rStart + (rEnd - rStart) / 2;

            if (target == matrix[mid][cMid]) {
                return new int[] { mid, cMid };
            }

            if (target < matrix[mid][cMid]) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }

        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        if (target <= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

}
