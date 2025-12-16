package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static void main(String[] args) {
        int[] arr  = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(arr,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arrayList = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i];
            candies[i] = candies[i] + extraCandies;
            int max =0;
            for (int j = 0; j < candies.length; j++) {
                if (max < candies[j]){
                    max =candies[j];
                }
            }
            if (candies[i] >= max){
                arrayList.add(true);
            }
            else {
                arrayList.add(false);
            }
            candies[i] =temp;
        }


        return arrayList;
    }
}
