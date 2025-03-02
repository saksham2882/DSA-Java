package Alpha_24_DP;

public class CWH_7_Target_Sum_Subset_Tabulation {

    // Check if we got target sum or not using this arr[] element. 
    // here row (i) represent -> no. of items,   and column (j) represent -> target sum 
    public static boolean targetSum(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
 
        // Initializes 0th column with true 
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int value = arr[i - 1];

                // valid + include 
                if (value <= j && dp[i - 1][j - value] == true) {
                    dp[i][j] = true;
                }
                // exclude
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];
    }
    
    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 1, 3 };
        int sum = 10;

        System.out.println("Target Sum Exists: " + targetSum(arr, sum));
    }
}
