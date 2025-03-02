package Alpha_3_Function_and_method;

public class CWH_6_Decimal_to_Binary {
    
    // Binary to Decimal :
    public static void DeciToBin(int num) {
        int originalNum = num;
        String s = "";
        while (num > 0) {
            int rem = num % 2;
            s = rem + s;
            num /= 2;
        }
        System.out.println("The Binary of " + originalNum + " is : " + s);
    }


    // Decimal to Binary : Mam Code
    public static void MamDeciToBin(int num) {
        int myNum = num;
        int pow = 0;
        int deciNum = 0;

        while (num > 0) {
            int LastDigit = num % 2;
            deciNum = deciNum + (LastDigit * (int) Math.pow(10, pow));

            pow++;
            num = num / 2;
        }
        System.out.println("Decimal of " + myNum + " = " + deciNum);
    }

    public static void main(String[] args) {
        
        DeciToBin(6);
        DeciToBin(-3);
        DeciToBin(20);

        MamDeciToBin(6);
        MamDeciToBin(-3);
        MamDeciToBin(20);
    }
}
