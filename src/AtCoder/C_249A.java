package AtCoder;

import java.util.Scanner;

public class C_249A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = 0; i < a; i++) {
            if (i < b){
                System.out.println("OK");
            }
            else {
                System.out.println("TO Many request");
            }
        }
    }
}
