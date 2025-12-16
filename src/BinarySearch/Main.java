package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,9,11,12,13,14};
        int target = 12;
        int out = binarySearch(arr ,target);
        System.out.println(out);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;


        while (start <= end) {
            int mid  = (start + end) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if ( target == arr [mid]){
                return mid;
            }
        }
        return -1;
    }
}
