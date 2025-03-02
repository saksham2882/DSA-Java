package Alpha_22_Hashing;

import java.util.HashMap;

public class CWH_12_Subarray_sum_equal_to_k {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, count)
        int sum = 0;
        int count = 0;

        map.put(0, 1);

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("No. of subArray whose sum equal to k: " + count);
    }
}