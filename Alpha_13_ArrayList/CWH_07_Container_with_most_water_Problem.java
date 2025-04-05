package Alpha_13_ArrayList;

import java.util.ArrayList;

public class CWH_07_Container_with_most_water_Problem {

    // Brute Force: O(n^2) :
    public static int storeWater(ArrayList<Integer> height) {
        int maxArea = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int h = Math.min(height.get(i), height.get(j));
                int w = j - i;
                int currWater = h * w;
                maxArea = Math.max(maxArea, currWater);
            }
        }
        return maxArea;
    }

    // Two Pointer Approach : O(n)
    public static int waterStore(ArrayList<Integer> height) {
        int maxArea = 0;
        int left = 0;
        int right = height.size() - 1;
        while (left < right) {
            int h = Math.min(height.get(left), height.get(right));
            int w = right - left;
            int currWater = h * w;
            maxArea = Math.max(maxArea, currWater);
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("The maximum water stored O)(n^2) is : " + storeWater(height));
        System.out.println("The maximum water stored O(n) is : " + waterStore(height));
    }
}
