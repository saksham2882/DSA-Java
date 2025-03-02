package Alpha_8_Bit_Manipulation;

public class CWH_6_Check_if_a_No_is_Power_of_2 {
    
    public static void isPower_Of_Two(int n) {
        int bitMask = n & (n - 1);
        if (bitMask == 0) {
            System.out.println(n + " is a Power of 2");
        }
        else {
            System.out.println(n + " is not a Power of 2.");
        }
    }
    public static void main(String[] args) {
        
        // Check if a number is a Power of 2 or not.

        isPower_Of_Two(4);
        isPower_Of_Two(7);
        isPower_Of_Two(16);
    }
}
