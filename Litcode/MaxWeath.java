public class MaxWeath{
    public static void main(String[] args) {
        int[][] accounts = { {1,2,3},
                             {3,4,1} };
        
        System.out.println("Maximum weath of customer: " + maximumWealth(accounts));
        
    }

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int[] person : accounts){
            int sum = 0;
            for(int acm : person){
                sum = sum + acm;
            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

}