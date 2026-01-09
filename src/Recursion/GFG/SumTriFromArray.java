package Recursion.GFG;

import java.util.Arrays;

public class SumTriFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumTriFromArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sumTriFromArray(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int[] out = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            out[i-1] = arr[i-1] + arr[i];
        }
        sumTriFromArray(out);
        System.out.println(Arrays.toString(out));
    }
}
