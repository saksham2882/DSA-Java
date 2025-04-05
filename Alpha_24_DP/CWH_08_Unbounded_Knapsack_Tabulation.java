package Alpha_24_DP;

public class CWH_08_Unbounded_Knapsack_Tabulation {
    
    // 1 item  ->  can include more than one times
    // row (i) represent  ->  no. of items  ,   and  column (j) represent   ->  knapsack size
    // T.C : O(n * W)
    public static int unBoundedKnapsack(int value[], int wt[], int W) { 
        int n = value.length;
        int dp[][] = new int[n + 1][W + 1];

        // Initialize 0th column with zero
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        // Initialize 0th row with zero
        for (int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int val = value[i - 1];
                int w = wt[i - 1];

                // case[1]: valid
                if (w <= j) {
                    int includeProfit = val + dp[i][j - w];
                    int excludeProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                }
                // case[2]: invalid
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        print(dp);

        return dp[n][W];
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
        int value[] = { 15, 14, 10, 45, 30 };
        int itemWeight[] = { 2, 5, 1, 3, 4 };
        int capacity = 7;

        System.out.println("Maximum Profit: " + unBoundedKnapsack(value, itemWeight, capacity));
    }
}
