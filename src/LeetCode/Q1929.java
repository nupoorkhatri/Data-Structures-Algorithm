package LeetCode;

import java.util.Arrays;

public class Q1929 {
    public static void main(String[] args) {

        int[] arr = {0,1,2};
        int[] arr1 = getConcatenation(arr);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = 2*nums.length;
        int[] num = new int[n];

        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i];
            if ( i ==  nums.length-1) {
                for (int j = 0; j < nums.length; j++) {
                    num[i+j+1] = nums[j];
                }
            }
        }
        return num;
    }
}
