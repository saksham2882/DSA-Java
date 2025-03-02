package Alpha_18_Greedy_Approach;

import java.util.Arrays;

public class CWH_4_Minimum_sum_absolute_difference {
    public static void main(String[] args) {
        
        // Time Complexity : O(nlogn)

        // int A[] = { 1, 2, 3 };
        // int B[] = { 2, 1, 3 };
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        // Sort both array
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum sum of Absolute difference Pair: " + sum);
    }
}
