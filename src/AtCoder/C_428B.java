package AtCoder;

import java.util.*;

public class C_428B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        String str = s.next();

        Map<String , Integer> map = new HashMap<>();

        for (int i = 0; i <= n-k; i++) {
            String s1 = str.substring(i , i+k);
            map.put(s1 ,map.getOrDefault(s1, 0) + 1);
        }
        int max = 0;
        for(int i : map.values()){
            max = Math.max(max, i);
        }
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                result.add(entry.getKey());
            }
        }

        System.out.println(max);
        System.out.println(String.join(" ", result));


    }
}