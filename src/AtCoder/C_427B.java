package AtCoder;

import java.util.Scanner;

public class C_427B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int [n+1];
        arr[0] = 1;
        for (int i = 1; i < n+1 ; i++) {
            int total = 0;
            for (int j = i; j >= 0 ; j--) {
                total = total + digitSum(arr[j]);
            }
            arr[i] = total;
        }
        System.out.println(arr[n]);
    }

    private static int digitSum(int i) {
        int sum = 0;
        while (i > 0){
            sum = sum + i%10;
            i = i/10;
        }
        return sum;
    }
}
