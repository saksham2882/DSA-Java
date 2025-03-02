package Alpha_3_Function_and_method;

class CWH_5_Binary_to_Decimal {

    // Binary To Decimal :
    public static void BinToDeci(int num) {
        int originalNum = num;
        int len = Integer.toString(num).length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int rem = num % 10;
            sum = sum + rem * (int) Math.pow(2, i);
            num = num / 10;
        }
        System.out.println("The Decimal of " + originalNum + " is : " + sum);
    }


    // Binary to Decimal : Mam Code
    public static void MamBinToDec(int num) {
        int myNum = num;
        int pow = 0;
        int deciNum = 0;

        while (num > 0) {
            int LastDigit = num % 10;
            deciNum = deciNum + (LastDigit * (int) Math.pow(2, pow));

            pow++;
            num = num / 10;
        }
        System.out.println("Decimal of " + myNum + " = " + deciNum);
    }

    
    public static void main(String[] args) {
        
        BinToDeci(1000);
        BinToDeci(-1000);
        BinToDeci(1011);

        MamBinToDec(1000);
        MamBinToDec(-1000);
        MamBinToDec(1011);
    }
}