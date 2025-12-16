package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {


        int[] arr = {2,3,4,5,6,7,8,9};
//        System.out.println(arr);
        System.out.println(" after which no. you want to reverse your array");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        reverse(arr , a);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse (int[] arr , int a ){
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
               c=i;
            }
        }
        c = c+1;
        int[] arr1 = new int[arr.length-c-1];
        int b = arr1.length-1;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[c];
            c++;
        }
        for (int i = 0; i <= arr1.length/2; i++) {
            swap(arr1 , i , b);
            b--;

        };
    }
    public static void swap (int[] arr, int index1 , int index2 ) {
        int temp = arr[index1];
        arr[index1] = arr[index2] ;
        arr[index2] = temp;
    }
}
