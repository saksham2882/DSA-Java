package Alpha_24_DP;

public class CWH_3_Climbing_Stairs_3_Climb_Allow {

    // Find no. of ways to climb nth stairs when allowed climb are either 1 or 2 or 3;

    // Solve using "Recursion + memoization" : -> O(N)
    public static int countWays(int n, int dp[]) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp) + countWays(n - 3, dp);
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];

        System.out.println("No. of ways to climb " + n + "th stairs: " + countWays(n, dp));
        
        for (int i : dp) {
            System.out.println(i);
        }
    }
}