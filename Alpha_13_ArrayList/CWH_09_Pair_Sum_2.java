package Alpha_13_ArrayList;

import java.util.ArrayList;

public class CWH_09_Pair_Sum_2 {

    // Case 1: Brute Force : O(n^2)         // It is applicable to any given order.

    // Case 2: Two Pointer Approach : O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;                        // breaking point (bp) Initialization.
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int leftP = bp + 1;                 // smallest element index.
        int rightP = bp;                    // largest element index.

        while (leftP != rightP) {
            int sum = list.get(leftP) + list.get(rightP);
            if (sum == target) {
                System.out.println("Pair found at index " + leftP + " and " + rightP);
                return true;
            }
            if (sum < target) {
                leftP = (leftP + 1) % n;
            } else {
                rightP = (rightP + n - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        // Find if any pair in a sorted and Rotated ArrayList has a target sum.
        // list = [11, 15, 6, 8, 9, 10] and target = 16

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        if (pairSum2(list, target)) {
            System.out.println("True");
        } else {
            System.out.println("Index pair not found for Element.\nFalse");
        }
    }
}
