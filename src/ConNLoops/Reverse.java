package ConNLoops;

public class Reverse {
    public static void main(String[] args) {
        int a = 123456;

        int count =0;
        while (a>0){
            int rem = a % 10;
            count = count*10 +rem;
            a = a/10;
        }
        System.out.println(count);
    }
}
