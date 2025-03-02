package Alpha_24_DP;

import java.util.Arrays;
import java.util.HashSet;

public class CWH_15_Longest_Increasing_Subsequence {

    // Find longest Increasing Subsequences (increasing subsequence -> sorted in ascending order with unique element)
    // here "n" -> length of arr1[], "m" -> length of arr2[]

    // Time complexity: O(n * m)
    public static int LIS(int arr1[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr1) {
            hs.add(num);
        }

        // new copied array
        int arr2[] = new int[hs.size()];
        int i = 0;
        for (int num : hs) {
            arr2[i++] = num;
        }

        // sort new array in ascending 
        Arrays.sort(arr2);
        return lcs(arr1, arr2); 
    }
    
    // LCS 
    public static int lcs(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n + 1][m + 1];

        // Initialize 0th row and column with "0"
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // if element match
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        print(dp);

        return dp[n][m];
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
        
        int arr1[] = { 50, 3, 10, 7, 40, 80 };

        System.out.println("Longest Increasing SubSequence length: " + LIS(arr1));
    }
} 