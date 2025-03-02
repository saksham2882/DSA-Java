package Alpha_24_DP;

public class CWH_20_Count_BSTs {

    // Count No. of BST created using giving No. of Node:
    public static int countBST(int n) {
        int dp[] = new int[n + 1];

        dp[0] = dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {

                // Cn = (C0 * Cn-1) + (C1 * Cn-2) + ....... (Cn-1 * C0)
                int leftSubTree = dp[j];
                int rightSubTree = dp[i - j - 1];

                dp[i] = dp[i] + (leftSubTree * rightSubTree); 
            }
        }
        
        return dp[n];
    }
    public static void main(String[] args) {
        int noOfNodes = 4;

        System.out.println("No. of BST Formed: " + countBST(noOfNodes));
    }
}