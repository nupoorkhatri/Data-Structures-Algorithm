package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int arr [] = {1,2,3,4};
//        int[] arra  = {123,5412,78,12};
//        System.out.println(arr.length   );
//        System.out.println(arra[2]);
//
//        // for each loop
//        for (int num :arr){
//            System.out.println(num);
//        }
//        System.out.println(Arrays.toString(arra));
//
//        String [] str = new String[5];
//
//        for (int i = 0; i < str.length; i++) {
//            Scanner in = new Scanner(System.in);
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));

        int [][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner in = new Scanner(System.in);
                arr[i][j]= in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
