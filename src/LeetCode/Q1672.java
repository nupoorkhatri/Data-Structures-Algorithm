package LeetCode;

public class Q1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        int max = maximumWealth(arr);
        System.out.println(max);
    }
    public static int maximumWealth(int[][] accounts) {
        int[] num = new int[accounts.length];
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];

            }
            num[i] = sum;
            sum = 0;
        }

        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if(max < num[i]){
                max = num[i];
            }
        }
        return max;
    }

}

