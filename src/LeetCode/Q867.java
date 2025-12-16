package LeetCode;

import java.util.Arrays;

public class Q867 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
        };
        int[][] out = transpose(mat);
        for (int i = 0; i < out.length; i++) {
            System.out.println(Arrays.toString(out[i]));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int m=0;
        int n=0;
        for (int i = 0; i < matrix.length; i++) {
            m = matrix.length;
            n = matrix[i].length;

        }

        int[][] out = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                out[j][i] = matrix[i][j];
            }
        }
        return out;
    }
}
