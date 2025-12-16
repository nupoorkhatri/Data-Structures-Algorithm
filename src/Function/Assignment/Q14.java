package Function.Assignment;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Xyz(num);
    }

    private static void Xyz(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
