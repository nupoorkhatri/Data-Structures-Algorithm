import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] arr =  { 12,43,54,87,12,88,54,12,87};
        int[] arr1 =  new int[arr.length];
        arr[0] = arr1[0];

        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 0 ; j < i ; j++) {
                int count = 0;
                if ( arr[i]==arr[j]) {
                    count++;
                }
                if (count == 0 ) {
                    arr1[i] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
