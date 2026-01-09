
//Problem Statement
//
//        Takahashi is playing a game at school. The game begins the moment the bell rings.
//
//        Immediately after the bell rings, he repeatedly performs the following cycle:
//        - Runs at a speed of S meters per second for A seconds
//        - Then remains stationary for B seconds
//
//        This pattern continues until X seconds have elapsed since the bell rang.
//
//        Your task is to calculate the total distance (in meters) Takahashi runs within the first X seconds.
//
//        --------------------------------------------------
//
//        Constraints
//
//        1 ≤ S ≤ 15
//        1 ≤ A ≤ 1000
//        1 ≤ B ≤ 1000
//        1 ≤ X ≤ 1000
//
//        All input values are integers.
//
//        --------------------------------------------------
//
//        Input Format
//
//        The input is given from standard input in the following format:
//
//        S A B X
//
//        --------------------------------------------------
//
//        Output Format
//
//        Print a single integer representing the total distance traveled.
//        Do not include the unit (meters).
//
//        --------------------------------------------------
//
//        Sample Input 1
//        7 3 2 11
//
//        Sample Output 1
//        49
//
//        Explanation:
//        From 0 to 3 seconds, Takahashi runs at 7 m/s and covers 21 meters.
//        From 3 to 5 seconds, he remains stationary.
//        From 5 to 8 seconds, he runs again and covers another 21 meters.
//        From 8 to 10 seconds, he remains stationary.
//        From 10 to 11 seconds, he runs and covers 7 meters.
//
//        Total distance = 49 meters.
//
//        --------------------------------------------------
//
//        Sample Input 2
//        6 3 2 9
//
//        Sample Output 2
//        36
//
//        Explanation:
//        From 0 to 3 seconds, he runs and covers 18 meters.
//        From 3 to 5 seconds, he remains stationary.
//        From 5 to 8 seconds, he runs and covers another 18 meters.
//        From 8 to 9 seconds, he remains stationary.
//
//        Total distance = 36 meters.
//
//        --------------------------------------------------
//
//        Sample Input 3
//        1 1 666 428
//
//        Sample Output 3
//        1
//
//        Explanation:
//        From 0 to 1 second, he runs and covers 1 meter.
//        From 1 to 428 seconds, he remains stationary.
//
//        Total distance = 1 meter.



package AtCoder;

import java.util.Scanner;

public class C_428A {
    public static void main(String[] args) {

        // Solution 1

//        Scanner s = new Scanner(System.in);
//        int Speed = s.nextInt();
//        int A = s.nextInt();
//        int B = s.nextInt();
//        int total = s.nextInt();
//        int time = 0;
//        int dist = 0;
//        int size = ((total / (A+B)) * 2) + (total % (A+B));
//        int[] arr = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            if (i%2 == 0 ) {
//                if (total - time >= A ) {
//                    arr[i] = A;
//                    time = time + A;
//                }
//                else {
//                    arr[i] = total - time;
//                    break;
//
//                }
//            }
//            else {
//                if (total - time >= B ) {
//                    arr[i] = B;
//                    time = time + B;
//                }
//                else {
//                    arr[i] = total - time;
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            if (i%2 == 0){
//                dist = dist + (arr[i] * Speed);
//            }
//        }
//        System.out.println(Arrays.toString(arr) );
//        System.out.println(dist);

        // solution 2


        Scanner s = new Scanner(System.in);

        int speed = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();
        int X = s.nextInt();

        int cycleTime = A + B;
        int fullCycles = X / cycleTime;
        int remainingTime = X % cycleTime;

        int runTime = fullCycles * A + Math.min(A, remainingTime);

        int distance = runTime * speed;

        System.out.println(distance);

    }
}
