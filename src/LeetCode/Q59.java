package LeetCode;

import java.util.Arrays;

public class Q59 {
    public static void main(String[] args) {
        int n = 3;
        int [][] yoo = generateMatrix(n);
        for (int i = 0; i < yoo.length; i++) {
            System.out.println(Arrays.toString(yoo[i]));
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] out = new int[n][n];
        int num = 1;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = out.length-1;
        int colEnd = out.length-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = colStart; col <= colEnd; col++) {
                out[rowStart][col] = num;
                num++;
            }
            rowStart++;
            for (int row = rowStart; row <= rowEnd ; row++) {
                out[row][colEnd] = num;
                num++;
            }
            colEnd--;
            if (rowStart <= rowEnd && colStart <= colEnd){
                for (int col = colEnd; col >= colStart ; col--) {
                    out[rowEnd][col] = num;
                    num++;
                }
                rowEnd--;
                for (int row = rowEnd; row >= rowStart ; row--) {
                    out[row][colStart] =num;
                    num++;
                }
                colStart++;
            }
        }
        return out;
    }
}
