package Alpha_12_Backtracking;

public class CWH_06_Grids_Ways {

    // Find number of ways to reach from source(0,0) to target (x,y) in n x m Grid. (Only RIGHT and DOWN move is ALLOWED).
    // Where : "i" => current cell column number, "j" => current cell row number, "n" => target cell row number, "m" => target cell column number.
    public static int gridWays(int i, int j, int n, int m) {
        
        // Base case :
        if (i == n - 1 && j == m - 1) {              // condition for last cell  (means target cell par aa gaye hai.)
            return 1;
        } 
        else if (i == n || j == m) {                 // Corner case: If moving right or down goes out of the grid, recursion should not continue (boundary check).
            return 0;
        }
        
        int w1_ways = gridWays(i + 1, j, n, m);      // for right move
        int w2_ways = gridWays(i, j + 1, n, m);      // for down move
        return w1_ways + w2_ways;
    } 
    
    public static void main(String[] args) {
        int n = 3, m = 3; 
        System.out.println("Total number of ways : " + gridWays(0, 0, n, m));        // here our target is last cell.
    }
}
