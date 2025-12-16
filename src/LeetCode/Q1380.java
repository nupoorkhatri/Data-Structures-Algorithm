package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q1380 {
    public static void main(String[] args) {
        int[][] mat = {
                {3,7,8},
                {9,11,13},
                {15,16,17},
        };
        List<Integer> num = luckyNumbers(mat);
        System.out.println(num);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> nums = new ArrayList<>();
        int min = matrix[0][0];
        int max = 0;
        int num = 0;

        return nums;
    }
}
