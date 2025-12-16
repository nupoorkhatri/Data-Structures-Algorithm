package Function.Assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no. ");
        int num = s.nextInt();
        Check(num);
        if (Check(num)==true){
            System.out.println("this no. is even");
        }
        else {
            System.out.println("this no. is odd");
        }
    }

    private static boolean Check(int num) {
        if (num%2==0){
            return true;
        }
        return false;
    }
}
