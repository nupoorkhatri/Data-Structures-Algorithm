package ConNLoops;

public class Pgrm1 {
    public static void main(String[] args) {
        int sal = 2500;
        if (sal >5000){
            sal += 3000;
        }
        else if (sal > 2000) {
            sal += 5000;
        } else {
            sal += 1000;
        }
        System.out.println(sal);
    }
}
