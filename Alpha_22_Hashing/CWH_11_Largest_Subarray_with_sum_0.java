package Alpha_22_Hashing;

import java.util.HashMap;

public class CWH_11_Largest_Subarray_with_sum_0 {

    public static void main(String[] args) {
        
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int sum = 0;
        int len = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, index)
        
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));   // j - i
            } else {
                map.put(sum, j);
            }
        }

        System.out.println("Largest SubArray with sum zero : " + len);
    }
}