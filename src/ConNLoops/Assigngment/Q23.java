package ConNLoops.Assigngment;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int f = n % i;
            if (f==0) {
                System.out.println(i);
            }

        }
    }
}
