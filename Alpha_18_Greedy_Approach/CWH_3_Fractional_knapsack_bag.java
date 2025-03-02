package Alpha_18_Greedy_Approach;

import java.util.*;

public class CWH_3_Fractional_knapsack_bag {

    public static void main(String[] args) {
        int item_Value[] = { 60, 100, 120 };
        int item_Weight[] = { 10, 20, 30 };
        int bag_Capacity = 50;

        // Assume item value and weight are not sorted above.
        // items_value associated with item_weight means Like 10kg -> 60Rs.)
        double ratio[][] = new double[item_Value.length][2];
        // 0th column => index
        // 1st column => ratio

        for (int i = 0; i < item_Value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = item_Value[i] / (double) item_Weight[i];
        }

        // sort 2D array in Ascending order:
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = bag_Capacity;
        int final_Value_bag_contain = 0;

        // we want ratio array in descending order so we traverse array from last
        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];

            if (capacity >= item_Weight[index]) {           // include full item in bag
                final_Value_bag_contain += item_Value[index];
                capacity -= item_Weight[index];
            } else {
                // include fractional item in the bag
                final_Value_bag_contain += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        
        System.out.println("Final item of value(money) bag contain: " + final_Value_bag_contain);

    }
}