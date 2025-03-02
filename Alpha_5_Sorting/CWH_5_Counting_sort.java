package Alpha_5_Sorting;

import Alpha_4_Arrays.CWH_2_Linear_Search;

public class CWH_5_Counting_sort extends CWH_2_Linear_Search {

    public static void countingSort(int[] arr) {       // nearly O(n + range )
        int largest = Integer.MIN_VALUE;
        // calculating Range :
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // calculate frequency : 
        int[] count = new int[largest + 1];            // here "0" index also include.
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting :
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };     // here range is : min -> 1 , max -> 7 so range :7

        // Used for positive and small range number.
        // But in Questions also asked for negative number. 
        // One approach is to treat negative numbers as positive numbers in a separate array and then apply count sort to this array in descending order. After sorting, add the "-" (negative) sign back to the numbers in the sorted array to get the final sorted result.

        countingSort(arr);
        display(arr);
    }
}
