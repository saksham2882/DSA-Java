package Alpha_24_DP;

import java.util.Arrays;

public class CWH_19_Catalans_Number {

    // Catalan Number ->  Cn = C0 * Cn-1 + C1 * Cn-2 + ....... Cn-1 * C0
    //1. Recursion:  T.C  =>  O(2^n)
    public static int catalan(int n) {
        int ans = 0;
        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            ans += catalan(i) * catalan(n - i - 1);
        }

        return ans;
    }


    // DP (Memoization) : O()
    public static int catalanMemo(int n, int dp[]) {
        int ans = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        for (int i = 0; i < n; i++) {
            ans += catalanMemo(i, dp) * catalanMemo(n - i - 1, dp);
            dp[n] = ans;
        }

        return dp[n];
    }


    // DP (Tabulation) : O(n^2)
    public static int catalanTabul(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {

                dp[i] = dp[i] + dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Catalan of 4 (C4): " + catalan(n));
        System.out.println("Catalan of 4 (C4): " + catalanMemo(n, dp));
        System.out.println("Catalan of 4 (C4): " + catalanTabul(n));
    }
}