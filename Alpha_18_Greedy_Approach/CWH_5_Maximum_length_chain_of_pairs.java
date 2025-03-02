package Alpha_18_Greedy_Approach;

import java.util.*;

public class CWH_5_Maximum_length_chain_of_pairs {
    public static void main(String[] args) {
        
        // Time complexity: O(nlogn)
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // Sort on the basis of second number in a pair
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;           // Always select first pair
        int chainEnd = pairs[0][1];    // Last selected pair end or Chain End

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Max length of chain: " + chainLength);
    }
}