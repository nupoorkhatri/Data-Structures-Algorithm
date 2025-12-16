package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        List<Integer> out = spiralOrder(matrix);
        System.out.println(out);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = colStart; col <= colEnd ; col++) {
                output.add(matrix[rowStart][col]);
            }
            rowStart++;
            for (int row = rowStart  ; row <= rowEnd ; row++) {
                output.add(matrix[row][colEnd]);
            }
            colEnd--;
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart ; col--) {
                    output.add(matrix[rowEnd][col]);
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart ; row--) {
                    output.add(matrix[row][colStart]);
                }
                colStart++;
            }
        }

        return output;
    }
}
