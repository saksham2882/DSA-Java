package Alpha_08_Bit_Manipulation;

public class CWH_04_Clear_Last_i_bits {

    // Clear i bits form Last :
    public static int clear_I_Bits_From_Last(int n, int i) {
        int bitMask = ((-1) << i);
        return n & bitMask; 
    }

    public static void main(String[] args) {
        
        System.out.println(clear_I_Bits_From_Last(15, 2));
    }
}
