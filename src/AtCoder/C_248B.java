package AtCoder;

import java.util.Scanner;

public class C_248B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long A = s.nextLong();
        long B = s.nextLong();
        long K = s.nextLong();

        long slimes = A;
        int count = 0;

        while (slimes < B) {
            slimes = slimes * K ;
            count++;
        }
        System.out.println(count);

    }
}
