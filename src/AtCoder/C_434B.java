package AtCoder;

import java.util.Scanner;

public class C_434B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }

        for (int i = 1; i <= m; i++) {
            float sum = 0.0f;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(A[j] == i){
                    sum = sum + B[j];
                    count++;
                }
            }
            System.out.println(sum / count);
        }
    }
}
