package Alpha_24_DP;

public class CWH_5_0_1_Knapsack_using_Memoization {

    // Here wt -> weight of items, W -> knapsack capacity, n -> index of item )
    // T.C : O(n * W)
    public static int knapsack(int value[], int wt[], int W, int n, int dp[][]) {     
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // valid case
        if (wt[n - 1] <= W) {
            // Include Item in knapsack:
            int ans1 = value[n - 1] + knapsack(value, wt, W - wt[n - 1], n - 1, dp);

            // Exclude item:
            int ans2 = knapsack(value, wt, W, n - 1, dp);

            dp[n][W] =  Math.max(ans1, ans2);
            return dp[n][W];
        } 
        // not valid case
        else {
            dp[n][W] = knapsack(value, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String[] args) {
        int value[] = { 15, 14, 10, 45, 30 };
        int ItemWeight[] = { 2, 5, 1, 3, 4 };
        int capacity = 7;

        int dp[][] = new int[value.length + 1][capacity + 1];
        // Initializes
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Maximum Profit: " + knapsack(value, ItemWeight, capacity, value.length, dp));

        // Print 2D Array:
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
