package Alpha_24_DP;

public class CWH_06_0_1_Knapsack_Tabulation {

    // Here wt -> weight of items, W -> knapsack capacity, n -> index of item )
    public static int knapsack(int value[], int wt[], int W) {   // O(n * W)
        int n = value.length;
        int dp[][] = new int[n + 1][W + 1];

        // Initializes 0th column with "0"
        for (int i = 0; i < value.length; i++) {
            dp[i][0] = 0;
        }

        // Initializes 0th row with "0"
        for (int j = 0; j < wt.length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {

                int v = value[i - 1];
                int w = wt[i - 1];

                // case[1]: valid
                if (w <= j) {
                    int includeProfit = v + dp[i - 1][j - w];
                    int excludeProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                } 
                else {     // Case[2]: Invalid
                    int excludeProfit = dp[i - 1][j];
                    dp[i][j] = excludeProfit;
                }
            }
        }
        
        return dp[n][W];
    }

    public static void main(String[] args) {
        int value[] = { 15, 14, 10, 45, 30 };
        int ItemWeight[] = { 2, 5, 1, 3, 4 };
        int capacity = 7;

        System.out.println("Maximum Profit: " + knapsack(value, ItemWeight, capacity));
    }
}
