package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q989 {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> a = addToArrayForm(num,k);
        System.out.println(a);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long abc = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            abc = abc*10 + num[i];
        }
        long nums = abc + k;
        while (nums != 0) {
            nums = nums/10;
            count++;
        }
        nums = abc+ k;

        long[] arr= new long[count];
        for (int i = 0; i < count; i++) {
            long a = nums % 10;

            arr[i] = a ;
            nums = nums/10;

        }

        for (int i = 0; i < count; i++) {
            if (i<count-1-i){
                swap(arr,0+i,count-1-i);
            }
            list.add((int) arr[i]);
        }

        return list;
    }
    public static void swap (long[] arr, int index1 , int index2 ) {
        long temp = arr[index1];
        arr[index1] = arr[index2] ;
        arr[index2] = temp;
    }
}
