package Alpha_24_DP;

public class CWH_09_Coins_Changes {

    // this problem is a variation of unbounded knapsack problem
    // find total no. of ways to provide changes using given coins.
    // here  row (i) represent  ->  no. of coins use,  and   column (j)  represent   ->  exchange value ( change value ) 

    // T.C : O(n * changes)
    public static int coinChange(int coins[], int changes) {   
        int n = coins.length;
        int dp[][] = new int[n + 1][changes + 1];

        // Initialize 0th column with 1 (means "1 way" when changes = 0, and coins = ....)
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }

        // Initialize 0th column with 1 (means "0 way" when changes = ..., and coins = 0)
        for (int j = 0; j < changes + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < changes + 1; j++) {
                // case[1]: valid
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                }
                // case[2]: invalid
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        print(dp);

        return dp[n][changes];
    }
    
    // print :
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(); 
    }
    
    public static void main(String[] args) {
        int coins[] = { 2, 5, 3, 6 };
        int changes = 10;
        // ans -> 5

        System.out.println("Total no. of ways: " + coinChange(coins, changes));
    }
}