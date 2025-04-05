package Alpha_01_Variable_And_DataType;

class CWH_01_Type_Promotion {
    public static void main(String[] args) {
        
        // Example 1:
        char a = 'a';
        char b = 'b';
        System.out.println(b - a);
        // char c = (a - b);                       // show an error not convert int to char.
        // System.out.println(c);


        // Example 2:
        short a1 = 5;
        byte b1 = 25;
        char c1 = 'c';
        
        // byte bt = a1 + b1 + c1;                // Show an error because we do not convert from int to byte.
        int bt = a1 + b1 + c1;                    // convert all into int.
        System.out.println(bt);

        byte bt1 = (byte)(a1 + b1 + c1);          // we forcefully convert this int into byte : Type casting
        System.out.println(bt1);
 

        // Example 3:
        int a2 = 10;
        float b2 = 20.25f;
        long c2 = 25;
        double d2 = 30;

        // int ans = a2 + b2 + c2 + d2;           // show an error of lossy conversion from double to int.
        double ans = a2 + b2 + c2 + d2;           // convert all into double
        System.out.println(ans);


        // Example 4:
        byte b3 = 5;
        // byte a3 = b3 * 2;                      // Show an error because now it become expression and java convert these expression into int and we assign it to byte so not allowed.
        byte a3 = (byte) (b3 * 2);
        
        System.out.println(a3);
    }
}