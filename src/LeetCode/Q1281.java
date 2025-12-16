package LeetCode;

import java.util.Scanner;

public class Q1281 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int product = 1;

        while (n>0) {
            int rem = n%10;
            sum += rem;
            product *= rem;
            n = n/10;
        }
        int res = product- sum;
        System.out.println(res);
    }
}
