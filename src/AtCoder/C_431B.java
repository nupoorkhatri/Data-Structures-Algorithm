package AtCoder;

import java.util.*;

public class C_431B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intialWeight = scanner.nextInt();
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] ops = new int[M];
        for (int i = 0; i < M; i++) {
            ops[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();

//        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            if (list.contains(ops[i])){
                int temp = list.indexOf(ops[i]);
                intialWeight = intialWeight - arr[ops[i] - 1];
                System.out.println(intialWeight);
                list.remove(temp);
            }else {
                intialWeight = intialWeight + arr[ops[i] - 1];
                list.add(ops[i]);
                System.out.println(intialWeight);
            }

        }
    }
}
