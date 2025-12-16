package Function.Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter num1 :");
        int num1 = s.nextInt();
        System.out.print("enter num2 :");
        int num2 = s.nextInt();
        System.out.print("enter num3 :");
        int num3 = s.nextInt();

        System.out.println("max of all three no. is " + Findmax(num1,num2,num3));

        System.out.println("min of all three no. is " + Findmin(num1,num2,num3));
    }

    private static int Findmin(int num1, int num2, int num3) {
        int min = num1;
        if (num2 <min){
            min = num2;
        }
        if (num3<min){
            min = num3;
        }
        return min;
    }

    private static int Findmax(int num1, int num2, int num3) {
        int max = num1;
        if (num2>max){
            max =num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }


}
