package Alpha_08_Bit_Manipulation;

public class CWH_03_Operations_on_bit {

    // Get ith Bit :
    public static int getIthBit(int n, int i) {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
    // Set ith Bit :
    public static int setIthBit(int n, int i) {
        int bitMask = (1 << i);
        return n | bitMask;
    }
    
    // Clear ith Bit : 
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update ith Bit :
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        }
        else {
            return setIthBit(n, i);
        }

        // Method 2 :
        // n = clearIthBit(n, i)
        // int bitMask = newBit << i;
        // return n | bitMask;
    }


    public static void main(String[] args) {
        
        System.out.println(getIthBit(15, 2));
        System.out.println(setIthBit(15, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(updateIthBit(10, 1, 0));
    }
}
