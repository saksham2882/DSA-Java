package Alpha_08_Bit_Manipulation;

public class CWH_07_Count_set_bits_in_a_number {
    
    public static int Count_set_bits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println("Number of COunt Bits : " + Count_set_bits(10));
        System.out.println("Number of COunt Bits : " + Count_set_bits(15));
    }
}
