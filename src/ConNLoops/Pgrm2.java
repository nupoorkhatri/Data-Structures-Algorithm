package ConNLoops;

import java.util.Scanner;

public class Pgrm2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();

//        for (int i = 0; i < n; i+=2) {
//            System.out.println(i);
//
//        }
//        while (n > 5) {
//            System.out.println(n);
//            n--;
//        }
        int max = n;
        if (n1 >max){
             max = n1;
        }
        if (n2 > max) {
             max = n2;
        }
        System.out.println(max);

    }
}
