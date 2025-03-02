package Alpha_24_DP;

public class CWH_10_Rod_Cutting_Tabulation {

    // problem is - cut totalRod into pieces and sell it to get maximum profit.
    // reverse think -> From using "n" pieces of rod, create "totalRod" length rod so that we get maximum profit.  (both give same answer)
    // Now it is same problem as unbounded knapsack.
    // weight -> length,  value  ->  price,  W  ->  totalRod

    // T.C : O(n * totalRod)
    public static int rodCutting(int length[], int price[], int totalRod) {
        int n = length.length;
        int dp[][] = new int[n + 1][totalRod + 1];

        // Initialize 0th column with "0" means totalRod length = 0, so max Profit = 0
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        // Initialize 0th row with "0" means length (no rod cut) = 0, so max Profit = 0
        for (int j = 0; j < totalRod + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < totalRod + 1; j++) {
                // case[1]: valid
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                }
                // case[2]: invalid
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        print(dp);

        return dp[n][totalRod];
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
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };  // pieces length
        int prices[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int totalRod = 8;

        System.out.println("Maximum Profit: " + rodCutting(length, prices, totalRod));
    }
}