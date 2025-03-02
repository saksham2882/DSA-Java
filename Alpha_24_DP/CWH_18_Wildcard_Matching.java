package Alpha_24_DP;

public class CWH_18_Wildcard_Matching {

    // " ? "   ->   single character changes
    // " * "   ->   sequences of character and also "empty"
    // check string1 is match with the pattern or not.

    // O(n * m)
    public static boolean wildCard(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        boolean dp[][] = new boolean[n + 1][m + 1];

        // Initialize:
        dp[0][0] = true;

        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        for (int j = 1; j < m + 1; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }


        // Left to right filling
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                // if last char is same
                if ((text.charAt(i - 1) == pattern.charAt(j - 1)) || pattern.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // if char is "*"
                else if (pattern.charAt(j - 1) == '*') {
                    boolean ignore = dp[i][j - 1];
                    boolean match = dp[i - 1][j];

                    dp[i][j] = ignore || match;
                } else {
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[n][m];
    }

    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "*****ba*****ab";      // True

        System.out.println("Wildcard Matching: " + wildCard(text, pattern));
    }
}