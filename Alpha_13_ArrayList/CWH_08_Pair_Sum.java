package Alpha_13_ArrayList;

import java.util.ArrayList;

public class CWH_08_Pair_Sum {

    // Brute Force Approach : O(n^2)
    public static void pairSum(ArrayList<Integer> num, int target){
        for (int i = 0; i < num.size(); i++) {
            for (int j = i + 1; j < num.size(); j++) {
                if (num.get(i) + num.get(j) == target) {
                    System.out.println("Pair found at index " + i + " and " + j);
                }
            }   
        }
    }


    // Two Pointer Approach : O(n)
    public static void pairSumTwoPoint(ArrayList<Integer> num, int target) {
        int left = 0;
        int right = num.size() - 1;
        while (left < right) {
            if (num.get(left) + num.get(right) == target) {
                System.out.println("Pair found at index " + left + " and " + right);
            }
            if (num.get(left) + num.get(right) < target) {
                left++;
            } else {
                right--;
            }
        }
    } 

    public static void main(String[] args) {

        // Find if any pair in a sorted ArrayList has a target sum.

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            num.add(i);
        }
        System.out.println(num);
        int target = 5;
        pairSum(num, target);
        pairSumTwoPoint(num, target);
    }
}
