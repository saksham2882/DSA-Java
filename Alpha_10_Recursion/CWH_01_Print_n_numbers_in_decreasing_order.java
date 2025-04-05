package Alpha_10_Recursion;

public class CWH_01_Print_n_numbers_in_decreasing_order {

    public static void printDec(int n) {
        // Base case :
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        // Recursion :
        printDec(n - 1);
    }
    
    public static void printInc(int n) {
        // Base Case :
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
    }
}