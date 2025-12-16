package LeetCode;

import java.util.Arrays;

public class Q832 {
    public static void main(String[] args) {
        int[][] img = {
                {1,1,0},
                {1,0,1},
                {0,0,0},
        };

        int[][] output = flipAndInvertImage(img);
        for (int i = 0; i < output.length; i++) {
            System.out.println(Arrays.toString(output[i]));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] output = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output[i][j] = image[i][n-1-j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (output[i][j]==0){
                    output[i][j] = 1;
                }
                else {
                    output[i][j] = 0;
                }
            }
        }

        return output;
    }
}
