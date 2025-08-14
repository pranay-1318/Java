public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 64, 70};
        int target = 1;
        System.out.println(search(arr, target, 0, arr.length));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e - s) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr, target, s, e - mid);
        }
        return search(arr, target, mid+1, e);
    }
}
