package LeetCode;

import java.util.Arrays;

public class Q169 {
    public static void main(String[] args) {
        int[] arr = {3,3,4};
        int out = majorityElement(arr);
        System.out.println(out);
    }
    public static int majorityElement(int[] nums) {

        int out = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length -1 ; j++) {
                if (nums[i] == nums [j+1]){
                    count++;
                }
            }
           if (count >= (nums.length/2)) {
               out = nums[i];
           }
        }
return out;
    }
}
