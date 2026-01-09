package AtCoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_439B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Set<Integer> set = new HashSet<>();
        n = HappyNum(n);
        while (n != 1) {
            if (set.contains(n)) {
                System.out.println(false);
                return;
            }
            set.add(n);
            n = HappyNum(n);
        }
        System.out.println(true);

    }
    public static int HappyNum (int n) {
        int sum = 0 ;

        while (n != 0) {
            int temp = n % 10;
            sum = sum + (temp * temp);
            n = n /10;
        }
        return sum;
    }
}
