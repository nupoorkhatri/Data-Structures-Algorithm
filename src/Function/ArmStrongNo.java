package Function;

public class ArmStrongNo {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i +" ");
            }

        }
    }

    private static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
//        if (sum == original) {
//            return true;
//        }
//        else
//            return false;
        // Or
        return sum == original;
    }
}
