package LeetCode;

import java.util.Arrays;

public class Q1572 {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int sum = diagonalSum(arr);
        System.out.println(sum);
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i==j || i+j == mat.length-1){
                    sum = sum +mat[i][j];
                }
            }
        }
        return sum;
    }

}
