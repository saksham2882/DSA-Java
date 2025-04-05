package Alpha_24_DP;

public class CWH_02_Climbing_Stairs {

    // Find No. of ways to climb to nth stair 

    // Approach 1: using "Recursion" ->  O(2^n) 
    public static int climbStairWays(int n) {
        if (n == 0) {
            return 1;        // 1 way for ground (only standing is also a 1 way)
        }
        if (n < 0) {
            return 0;        // 0 ways for underGround
        }
        return climbStairWays(n - 1) + climbStairWays(n - 2);
    }
    
    
    // Approach 2: using "Recursion + memoization"  ->  O(n)
    public static int countWays(int n) {
        int dp[] = new int[n + 1];

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != 0) {    // already calculated
            return dp[n];
        }

        dp[n] = countWays(n - 1) + countWays(n - 2);
        return dp[n];
    }


    // Approach 3: using "Iteration + Tabulation"  ->  O(N)
    public static int countWaysTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            }
            else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("No. of ways to reach " + n + "th stairs: " + climbStairWays(n));

        System.out.println("No. of ways to reach " + n + "th stairs Using DP memoization: " + countWays(n));

        System.out.println("No. of ways to reach " + n + "th stairs Using DP Tabulation: " + countWaysTabulation(n));

    }
}