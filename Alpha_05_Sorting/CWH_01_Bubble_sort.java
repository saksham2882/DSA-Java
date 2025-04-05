package Alpha_05_Sorting;

import Alpha_04_Arrays.CWH_02_Linear_Search;

public class CWH_01_Bubble_sort extends CWH_02_Linear_Search {

    // Bubble Sort : O(n)
    public static void Bubble_Sort(int[] arr) {
        int passes = 0;
        int n = arr.length;
        int already_sorted = 0;

        for (int i = 0; i < n - 1; i++) {
            already_sorted = 1;

            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    already_sorted = 0;
                }
            }
            passes++;
            if (already_sorted == 1) {
                break;
            }
        }
        System.out.println("Total No. of Passes : " + passes);
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 1, 3, 2 };
        int[] arr1 = { 11, 12, 13, 14, 15 };
        // int[] arr = { 5, 4, 3, 2, 1 };

        Bubble_Sort(arr);              // Ascending
        display(arr);
        Bubble_Sort(arr1);             // Ascending
        display(arr1);

    }
}
