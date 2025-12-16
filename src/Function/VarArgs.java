package Function;

public class VarArgs {
    public static void main(String[] args) {
         fun(1,2,3,4);
         funString(15,22,"nupoor","tanvi","paridhi","bhavika");
    }


    private static void funString(int x,int y, String ...a) {
        // it is a rule that variable length should be come at the end as well
    }

    private static void fun(int ...v) {
    }
}
