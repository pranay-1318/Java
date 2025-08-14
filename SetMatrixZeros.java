import java.util.*;
public class SetMatrixZeros {
    public static void main(String[] args) {
        
        int[][] matrix = {{1,1,1},
                          {1,0,1},
                          {1,1,1}};

        int[][] ans = matrix;

         for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[0].length; j++){

                if(matrix[i][j] == 0){
                    for(int r=0; r<matrix[0].length; r++){
                         ans[i][r] = 0;

                    }
                    // System.out.println(Arrays.deepToString(matrix));

                    // for(int c=0; c<matrix[0].length; c++){
                    //      ans[c][j] = 0;

                    // }
                    
                }
            }
            
        }

        System.out.println(Arrays.deepToString(matrix));
    }
    
}
