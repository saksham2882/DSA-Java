package Alpha_10_Recursion;

public class CWH_12_Binary_Strings_Problem {

    // Print all the binary strings of size N without consecutive "ones".
    public static void printBinStr(int n, int lastPlace, String str) {
        // Base case:
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinStr(n-1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStr(n-1, 1, str + "1");
        }
    }
    
    public static void main(String[] args) {
        
        printBinStr(3, 0, "");
    }
}
