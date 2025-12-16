// Given an array/list 'ARR' of integers and a position 'M'.
// You have to reverse the array after that position.

package CodingNinja;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int m = 3;
        reverse ( arr , m );
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int m) {
        int start = m+1;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr [start] = arr[end];
            arr[end] =temp;
            start++;
            end--;
        }

    }
}
