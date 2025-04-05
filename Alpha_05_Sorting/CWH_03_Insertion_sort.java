package Alpha_05_Sorting;

import Alpha_04_Arrays.CWH_02_Linear_Search;

public class CWH_03_Insertion_sort extends CWH_02_Linear_Search {

    // Insertion sort:
    public static void Insertion_sort(int[] arr) {
        int passes = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int curr = arr[i];
            int prev = i - 1;

            // Finding out the correct position to insert.
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            
            // insertion
            arr[prev + 1] = curr;
            passes++;
        }

        System.out.println("Total passes: " + passes);
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 1, 3, 2 };

        Insertion_sort(arr);
        display(arr);
    }
}
