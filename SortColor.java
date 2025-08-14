import java.util.*;
public class SortColor {
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while(mid <= end){

            switch(nums[mid]){
                case 0:
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;
                
                case 1:
                    mid++;
                    break;

                case 2:   // {imagine 2 first  image only}
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    private static void swap(int[] arr, int pos1, int pos2){
    int temp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = temp;
}

}
