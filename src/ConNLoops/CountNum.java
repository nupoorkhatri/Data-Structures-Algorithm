package ConNLoops;

public class CountNum {
    public static void main(String[] args) {
        int a = 156545;

        int count = 0;
        while (a>0) {
            int rem = a%10;
            if (rem == 5){
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }
}
