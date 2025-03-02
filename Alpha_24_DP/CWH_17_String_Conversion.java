package Alpha_24_DP;

public class CWH_17_String_Conversion {

    // find no. of "deletion" and "insertion" operation needed to convert str1 to str2:
    // n -> str1.length,     m -> str2.length

    public static int stringConvert(String str1, String str2) {

        int lcs = LCS(str1, str2);
        int noOfDelete = str1.length() - lcs;
        int noOfAdd = str2.length() - lcs;
        
        System.out.println("No. of Deletion: " + noOfDelete);
        System.out.println("No. of Addition: " + noOfAdd);

        return noOfAdd + noOfDelete;
    }

    // LCS:
    public static int LCS(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // Initialize 0th row and 0th column 
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // if same
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "aceg";

        System.out.println("Total no. of Operation: " + stringConvert(str1, str2));
    }
}