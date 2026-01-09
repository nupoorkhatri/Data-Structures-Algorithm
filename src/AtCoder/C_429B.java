package AtCoder;

import java.util.Scanner;

public class C_429B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];

        }
        for (int i = 0; i < n ; i++) {
            if (sum - arr[i] == x){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
