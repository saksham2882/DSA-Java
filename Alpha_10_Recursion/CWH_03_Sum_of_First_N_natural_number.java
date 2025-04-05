package Alpha_10_Recursion;

public class CWH_03_Sum_of_First_N_natural_number {
    
    // O(n) : for both time and space.
    public static int firstSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + firstSum(n - 1);
        return sum;
    }
    public static void main(String[] args) {
        
        int n = 5;
        System.out.println(firstSum(n));
    }
}
