package Alpha_3_Function_and_method;

public class CWH_1_Call_by_Value {

    public static void changeA(int a) {       // parameters (formal parameters)
        a = 10;
        System.out.println(a);                // here a = 10 only inside this method.Because here 'a' pass as a call by value (means copy of original variable for this method only.)
    }

    public static void main(String[] args) {
        
        int a = 5;
        System.out.println(a);
        changeA(a);                           // Arguments (actual parameters)
        System.out.println(a);

    }
}
