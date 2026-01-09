package AtCoder;

import java.util.Arrays;
import java.util.Scanner;

public class C_436B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        int r = 0;
        int c = (n-1) / 2;   // start at top row, middle column

        for (int num = 1; num <= n * n; num++) {
            matrix[r][c] = num;

            int nextR = (r - 1 + n) % n;
            int nextC = (c + 1) % n;

            if (matrix[nextR][nextC] == 0) {
                r = nextR;
                c = nextC;
            } else {
                r = (r + 1) % n;

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        }
}
