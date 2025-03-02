package Alpha_18_Greedy_Approach;

import java.util.Arrays;
import java.util.Collections;

public class CWH_6_Indian_Coins {
    public static void main(String[] args) {
         
        // here we use Integer Object because Collections.reverseOrder not work on primitive types.
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };    

        // Sort coins in descending order:
        Arrays.sort(coins, Collections.reverseOrder()); 
        // This sorts an array of Integer objects in descending order. 
        // Note that this works with Integer[] and not int[], because Collections.reverseOrder() works with objects, not primitive types.
        
        int count = 0;
        int amount = 590;
        System.out.println("Amount to change in coins: " + amount);

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    System.out.println("Coin used: " + coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Minimum no. of coins or notes changes for value is: "  + count);
    }
}