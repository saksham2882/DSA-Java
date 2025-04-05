package Alpha_24_DP;

public class CWH_04_0_1_Knapsack {

    // Here wt -> weight of items,  W -> knapsack capacity,   n -> index of item )
    public static int knapsack(int value[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        // valid case
        if (wt[n-1] <= W) {
            // Include Item in knapsack:
            int ans1 = value[n-1] + knapsack(value, wt, W - wt[n-1], n - 1);

            // Exclude item: 
            int ans2 = knapsack(value, wt, W, n - 1);

            return Math.max(ans1, ans2);
        }
        // not valid case
        else {
            return knapsack(value, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        
        int value[] = { 15, 14, 10, 45, 30 };
        int ItemWeight[] = { 2, 5, 1, 3, 4 };
        int capacity = 7;

        System.out.println("Maximum Profit: " + knapsack(value, ItemWeight, capacity, value.length));
    }
}