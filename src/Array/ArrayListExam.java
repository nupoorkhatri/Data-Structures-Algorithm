package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //initialization
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // declaration 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.next());
            }
        }


    }
}
