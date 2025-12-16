package LeetCode;

import java.util.Arrays;

public class Q1480 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] num = runningSum(arr);
        System.out.println(Arrays.toString(num));
    }
    public static int[] runningSum(int[] nums) {
        int[] abc = new int[nums.length];
        abc[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            abc[i] = nums[i] + abc[i-1];
        }
        return abc;
    }
}
