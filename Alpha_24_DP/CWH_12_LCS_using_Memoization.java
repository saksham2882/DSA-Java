package Alpha_24_DP;

public class CWH_12_LCS_using_Memoization {

    // Find the longest common subsequence length:
    // here "n" -> length of str1, "m" -> length of str2

    // Time complexity:  O(n * m)
    public static int lcs(String str1, String str2, int n, int m, int dp[][]) {

        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        // if last character is same
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            dp[n][m] = lcs(str1, str2, n - 1, m - 1, dp) + 1;
            return dp[n][m];
        }
        // if different
        else {
            int ans1 = lcs(str1, str2, n - 1, m, dp);
            int ans2 = lcs(str1, str2, n, m - 1, dp);
            
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
    }
    
    public static void main(String[] args) {
        
        String str1 = "abcd";
        String str2 = "aceb";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // initialize dp[][] with -1
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("LCS length is: " + lcs(str1, str2, n, m, dp));
        // Answer -> lcs = "abdg", length = 4

        // print DP array:
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}