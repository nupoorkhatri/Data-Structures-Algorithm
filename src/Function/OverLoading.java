package Function;

public class OverLoading {
    public static void main(String[] args) {
        fun(67);
        fun("nupoor khatri");
        fun(25,45,"nupoor");
        //fun(); // this can be empty in the case of multiple
        // function are defined by a same name
    }

    private static void fun(int i) {
        System.out.println(i);
    }
    private static void fun(String name){
        System.out.println(name);
    }
    public static void fun(int a,int b,String xyz) {
        System.out.println(a+b+xyz);
    }
}
