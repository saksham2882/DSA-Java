package Alpha_10_Recursion;

public class CWH_09_Tiling_Problem {

    // Calculate total no. of ways to place tile on floor.
    public static int tiling_Problem(int n) {          // 2 x n (floor size)
        // Base case:
        if (n == 0 || n == 1) {
            return 1;
        }

        // 1. vertical choice :
        int fnm1 = tiling_Problem(n - 1);

        // 2. Horizontal choice :
        int fnm2 = tiling_Problem(n - 2);

        // Total ways to place a tile :
        int Total_Ways = fnm1 + fnm2;
        return Total_Ways;
    }
    
    public static void main(String[] args) {
        
        System.out.println(tiling_Problem(30));
    }
}
