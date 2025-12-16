package LeetCode;

public class Q1854 {
    public static void main(String[] args) {
        int[][] log = {
                {1993,1999},
                {2000,2010},
        };
        int yr = maximumPopulation(log);
        System.out.println(yr);
    }
    public static int maximumPopulation(int[][] logs) {
        int yr = logs[0][0];
        for (int i = 0; i < logs.length; i++) {
            if (logs[i][0] < logs[i][1]){
                yr = logs[i][1];
            }
        }
        return yr;
    }
}
