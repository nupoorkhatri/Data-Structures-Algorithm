package Function;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            //int a = 10;  and a before definded value can not be redefine in a block
            a = 65; // but can reasign value
            int c =5;
            // and a value defined in block will be used in a block only not in outside function
        }
        System.out.println(a);
        // System.out.println(c); // value insialise in block will remain in block

        // if we have initialised a value outside a block it we used
        // in both ouside and inside but a value used inside the block it will only used inside only
        // but can be redefined
        // lover level will going to shadow by the upr level





    }
    static void random (int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
