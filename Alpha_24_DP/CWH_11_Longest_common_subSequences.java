package Alpha_24_DP;

public class CWH_11_Longest_common_subSequences {

    // Find the longest common subsequence length:
    // here "n" -> length of str1,   "m"  ->  length of str2
    // Time complexity: O(2^(min(n,m)))
    
    public static int lcs(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        // if last character is same in both string
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {    // "-1" because of "0" based index
            return lcs(str1, str2, n - 1, m - 1) + 1;
        }
        // if different
        else {
            int ans1 = lcs(str1, str2, n - 1, m);
            int ans2 = lcs(str1, str2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }
    
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();

        System.out.println("LCS length is: " + lcs(str1, str2, n, m));
        // Answer -> lcs = "abdg",  length = 4
    }
}