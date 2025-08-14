
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ {

public class LiEvenDigit{
    public static void main(String[] args){

        int[] nums = {12,345,2,6,7896,11};

        System.out.println("Even Number in array: " + findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
          
        // if (numberOfDigits % 2 == 0) {
        //     return true;
        // }
        // return false;
        
        return numberOfDigits % 2 == 0;
        
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;

        while(num > 0){
            count ++;
            num = num /10;
        }
     return count;
    }
   
}
