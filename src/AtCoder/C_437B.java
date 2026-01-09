package AtCoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_437B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] matrix = new int[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }
        int max = 0;

        for (int i = 0; i < H; i++) {
            int count = 0;
            for (int j = 0; j < W; j++) {
                if(set.contains(matrix[i][j])){
                    count++;
                }
            }
            max = Math.max(count,max);
        }
        System.out.println(max);
    }

}
