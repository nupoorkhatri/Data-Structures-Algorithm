package LeetCode;

import java.util.Arrays;

public class Q238 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] out = productExceptSelf(nums);
        System.out.println(Arrays.toString(out));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int num = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                count++;
            }
        }
        if (count == 0){
            for (int i = 0; i < nums.length ; i++) {
                num = num * nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                out[i] = num / nums[i];
            }
        } else if (count == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==0){
                    for (int j = 0; j < nums.length; j++) {
                        if (i != j) {
                            num = num * nums[j];
                        }
                    }
                    out[i] =num;
                }
                else {
                    out [i] = 0 ;
                }
            }
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                out[i] = 0;
            }
        }
        return out;
    }

}
