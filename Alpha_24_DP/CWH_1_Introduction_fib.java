package Alpha_24_DP;

public class CWH_1_Introduction_fib {

    // nth fibonacci with D.P using memoization: O(N)    -> in normal case it become exponential
    public static int fib(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {     // fib(n) is already calculated
            return dp[n];
        }

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
    

    // nth fibonacci with D.P using Tabulation : O(N)
    public static int fib_usingTab(int n, int dp[]) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];       // automatically initialize with 0 in each index
        
        System.out.println(n +  "th Fibonacci using Memoization: " + fib(n, dp));
        System.out.println(n + "th Fibonacci using Tabulation: " + fib_usingTab(n, dp));
    }
}