package Alpha_24_DP;

public class CWH_16_Edit_Distance {

    // find minimum no. of operation to convert word1 into word2;
    // Allowed operations : add, delete, replace
    // here "n" -> length of word1, "m" -> length of word2

    // O(n * m)
    public static int editDist(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];

        // Initialize 0th row with the current word2.length()  -> j  and Initialize 0th column with the current word1.length()  -> i
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {     // 0th row
                    dp[i][j] = j;
                }
                if (j == 0) {     // 0th column
                    dp[i][j] = i;
                }
            }
        }
        

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                // if character same
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // if different
                else {
                    int ans1 = dp[i][j - 1] + 1;      // add
                    int ans2 = dp[i - 1][j] + 1;      // delete
                    int ans3 = dp[i - 1][j - 1] + 1;  // replace

                    dp[i][j] = Math.min(ans1, Math.min(ans2, ans3));
                }
            }
        }
        
        return dp[n][m];
    }

    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";

        System.out.println("Minimum Operation: " + editDist(word1, word2));
    }
}