package Alpha_22_Hashing;

import java.util.*;

public class CWH_04_Majority_Element {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // Method 1: 
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }

            // Method 2: short-cut
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        

        // Method 1: 
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > arr.length / 3) {
                System.out.println("Majority Element is: " + key);
            }
        }
 

        // Method 2: short-hand
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println("Majority Element is: " + key);
            }
        }
    }
}
