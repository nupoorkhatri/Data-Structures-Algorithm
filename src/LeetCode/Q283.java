package LeetCode;

import java.util.Arrays;

public class Q283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12 };
        System.out.println(Arrays.toString(nums));
        moveZeros(nums);
    }
    public static void moveZeros (int [] nums ) {
        int [] out = new int[nums.length];
        int count = 0;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        if (count == 0){
            System.out.println(nums);
        } else if (count >= 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0){
                    out[a] = nums[i];
                    if (out[a] != 0 ){
                        a++;
                    }
                }

            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = out[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
