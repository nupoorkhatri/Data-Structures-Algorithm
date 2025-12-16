package LeetCode;

import java.util.Arrays;

public class Q217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        boolean out = containsDuplicate(arr);
        System.out.println(out);
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length -1; j++) {
//                if (nums[i] == nums[j+1]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
