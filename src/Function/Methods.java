package Function;

import java.util.Scanner;

public class Methods  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your name : ");
        String s1 =s.next();

        String hey = greet(s1);
        System.out.println(hey);
    }

    private static String greet(String s1) {
        return ("hello " +s1);
    }

    // in void we only not return the value and in int we used return the value
    // after return nothing will exicute and it return he final value
    // first main function will run only
    // arguements have the value
    private static void sum() {
    }
}
