package Alpha_04_Arrays;

public class CWH_10_Best_Time_to_Buy_Stock {

    // Brute Force : O(n^2)
    public static int Max_Stock_Profit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
    }


    // Optimal Way : O(n)
    public static int buyAndSellStocks(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {                   // means time to sell to get profit
                int profit = prices[i] - buyPrice;        // today's profit;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];                     // time to buy stock 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        // int[] prices = { 7, 6, 5, 4, 3, 2 };

        int profit = Max_Stock_Profit(prices);
        System.out.println("Max Profit : " + profit);

        int pro = buyAndSellStocks(prices);
        System.out.println("Max Profit : " + pro);
    }
}

