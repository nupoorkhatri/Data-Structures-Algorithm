package LeetCode;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums,target);
        System.out.println(Arrays.toString(output));
    }
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    output[0] = i;
                    output[1] = j;
                }
                sum = 0;
            }
        }
        return output;
    }
}
