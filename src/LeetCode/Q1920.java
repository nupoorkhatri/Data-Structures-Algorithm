package LeetCode;

import java.util.Arrays;

public class Q1920 {
    public static void main(String[] args) {

        int[] arr = {5,0,1,2,3,4};
        int[] nums = buildArray (arr);
        System.out.println(Arrays.toString(nums));
    }
    private static int[] buildArray(int[] arr) {
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = arr[arr[i]];

        }
        return num;
    }

}
