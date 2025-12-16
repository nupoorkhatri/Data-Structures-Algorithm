package LeetCode;

import java.util.Arrays;

public class Q73 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}
        };
        setZeroes(mat);
    }
    public static void setZeroes(int[][] matrix) {
        int row = 0;
        int col = 0;
        int a = matrix.length;
        int b = matrix[0].length;
        int[][] out = new int[a][b];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                out[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0) {
                    row = i;
                    col = j;
                    for (int m = 0; m < matrix.length; m++) {
                        out[m][col] = 0;
                    }
                    for (int n = 0; n < matrix[row].length; n++) {
                        out[row][n] = 0;
                    }
                }
            }
        }


        for (int i = 0; i < out.length; i++) {
            System.out.println(Arrays.toString(out[i]));
        }


    }
}
