package LeetCode;

import java.util.Arrays;

public class Q1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int highestAltitude = largestAltitude(gain);
        System.out.println(highestAltitude);
    }
    public static int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length+1];
        alt[0] = 0;
        for (int i = 1; i < gain.length+1; i++) {
            alt[i] = gain[i-1] + alt [i-1];
        }

        int max= 0;
        for (int i = 0; i < alt.length; i++) {
            if (alt[i]>max){
                max = alt[i];
            }
        }
        return max;
    }
}
