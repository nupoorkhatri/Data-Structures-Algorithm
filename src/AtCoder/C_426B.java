package AtCoder;

import java.util.Scanner;

public class C_426B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 ){
                char ch = str.charAt(i);
                char ch1 = str.charAt(i+1);
                char ch2 = str.charAt(i+2);
                if (ch != ch1 && ch != ch2){
                    System.out.println(ch);
                    break;
                }

            }else if ( i != 0 && i != str.length() - 1) {
                char ch2 = str.charAt(i+1);
                char ch = str.charAt(i);
                char ch1 = str.charAt(i-1);
                if (ch != ch1){
                    System.out.println(ch);
                    break;

                }

            }
            else {
                char ch = str.charAt(i);
                char ch1 = str.charAt(i-1);
                if (ch != ch1){
                    System.out.println(ch);
                    break;

                }
            }
        }
    }
}
