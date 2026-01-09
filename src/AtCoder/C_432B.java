package AtCoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class C_432B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (num > 0) {

            list.add(num % 10);
            num = num / 10;

        }
        Collections.sort(list);
        if (list.get(0) == 0) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) != 0){
                    int temp = list.get(0);
                    list.set(0 , list.get(i));
                    list.set(i , temp);
                    break;
                }
            }
        }

        long result = 0 ;
        for (int d: list) {
            result = result * 10 + d;

        }
        System.out.println(result);


    }
}
