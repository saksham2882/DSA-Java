package Alpha_24_DP;

public class CWH_14_Longest_Common_Substring {

    // Find longest common subString length.
    // here "n" -> length of str1, "m" -> length of str2

    // Time complexity: O(n * m)
    public static int lcSubString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;

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

                // if character is same
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
                // if different -> reset substring counter
                else {
                    dp[i][j] = 0;
                }
            }
        }

        print(dp);

        return ans;
    }

    // print:
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
        String str1 = "ABCDE";
        String str2 = "ABGCE";

        System.out.println("Longest common subString length: " + lcSubString(str1, str2));
    }
}