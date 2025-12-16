package ConNLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        char cr = in.next().trim().charAt(0);

        if (cr >= 'a' && cr <= 'z'){
            System.out.println("lover case");
        }
        else {
            System.out.println("upper case");
        }
    }
}
