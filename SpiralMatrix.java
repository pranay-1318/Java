
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        
        int n = 3;

        int[][] ans = new int[n][n];
        
        System.out.println(ans);
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int num = 1;

        while((top <= bottom && left<= right) && num<=n*n){
             for(int j=top; j<=right; j++){
            ans[top][j] = num++;  
        }
            top++;
        
         for(int j=top; j<=bottom; j++){
            ans[j][right] = num++;
         }
            right--;

         for(int j=right; j>=left; j--){
            ans[bottom][j] = num++;
         }
            bottom--;

         for(int j=bottom; j>=top; j--){
            ans[j][left] = num++;
         }

            left++;

        }

        System.out.println(Arrays.deepToString(ans));

    }

}
