package AtCoder;

import java.util.Scanner;

public class C_438B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int count = 0;
        int min = 0;
        for (int i = 0; i <= n-m; i++) {
            String s1 = s.substring(i, i+m);
            for (int j = 0; j < m; j++) {
                char ch1 = s1.charAt(j);
                char ch2 = t.charAt(j);
                if(ch1 >= ch2){
                    count = count + (ch1 - ch2);
                }
                else {
                    count = count + (9 - (ch2 - ch1) + 1);
                }

            }
            if(i == 0) {
                min =count;
            }
            else {
                min = Math.min(min , count);
            }
            count =0;
        }
        System.out.println(min);

    }
}
