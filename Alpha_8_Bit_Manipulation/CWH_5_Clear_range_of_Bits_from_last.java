package Alpha_8_Bit_Manipulation;

public class CWH_5_Clear_range_of_Bits_from_last {
    
    // Clear Range of Bits From the last :
    public static int clear_range_of_Bits(int n, int i, int j) {
        int a = ((-1) << (j + 1));
        int b = (i << i) - 1;
        int bitMask = a | b;

        return n & bitMask;
    }

    public static void main(String[] args) {
        
        System.out.println(clear_range_of_Bits(10, 2, 4));
    }
}
