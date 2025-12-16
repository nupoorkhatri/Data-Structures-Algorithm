package LeetCode;

public class Q1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0){
                nums[i] = nums[i]/10;
                count++;
            }
            if (count % 2 == 0){
                num++;
            }
            count = 0 ;
        }
        return num;
    }
}
