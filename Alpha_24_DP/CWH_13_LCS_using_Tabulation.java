package Alpha_24_DP;

public class CWH_13_LCS_using_Tabulation {

    // Find the longest common subsequence length:
    // here "n" -> length of str1, "m" -> length of str2

    // Time complexity: O(n * m)
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // initialize 0th column with "0" means when m == 0
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        // initialize 0th row with "0" means when n == 0
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                // if last character is same
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;  // diagonal cell + 1
                }
                // if different 
                else {
                    int ans1 = dp[i - 1][j];          // up cell
                    int ans2 = dp[i][j - 1];          // left cell
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";

        System.out.println("LCS length is: " + lcs(str1, str2));
    }
}