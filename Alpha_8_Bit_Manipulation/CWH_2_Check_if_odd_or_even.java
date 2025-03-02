package Alpha_8_Bit_Manipulation;

public class CWH_2_Check_if_odd_or_even {

    public static void Odd_Even(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    
    public static void main(String[] args) {
        
        int n = 1010;

        Odd_Even(n);
    }
}
