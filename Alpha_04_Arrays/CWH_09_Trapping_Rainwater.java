package Alpha_04_Arrays;

public class CWH_09_Trapping_Rainwater {

    public static int Trapping_Rainwater(int[] height) {         // O(n)

        int n = height.length;

        // Calculate left max boundary
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int TrappedWater = 0;
        
        // loop
        for (int i = 0; i < n; i++) {

            // water Level = min(leftMaxBoundary, rightMaxBoundary);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water = water level - height
            TrappedWater += waterLevel - height[i];
        }
        
        return TrappedWater;
    }

    public static void main(String[] args) {

        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        // assume box width = 1

        int trap = Trapping_Rainwater(height);
        System.out.println("Total Trapped Water : " + trap);
    }
}