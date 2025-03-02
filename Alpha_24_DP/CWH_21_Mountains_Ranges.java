package Alpha_24_DP;

public class CWH_21_Mountains_Ranges {

    // Find No. of Possible mountains Ranges using the giving pairs (/ \)
    // T.C :  O(n^2)
    public static int mountainsRanges(int n){
        int dp[] = new int[n + 1];

        dp[0] = dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            // i pairs -> mountains ranges  => Ci
            for (int j = 0; j < i; j++) {
                // Cn = (C0 * Cn-1) + (C1 * Cn-2) + ....... (Cn-1 * C0)
                int inside = dp[j];
                int outside = dp[i - j - 1];

                dp[i] = dp[i] + (inside * outside);
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int noOfPairs = 4;
        
        System.out.println("No. of Mountains Ranges: " + mountainsRanges(noOfPairs));
    }
}
