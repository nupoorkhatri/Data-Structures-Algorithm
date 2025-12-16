package LeetCode;

public class Q1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {4,3,2,1,0};
        System.out.println(createTargetArray(nums,index));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[index[i]] = nums[i];
        }
        return output;
    }
}
