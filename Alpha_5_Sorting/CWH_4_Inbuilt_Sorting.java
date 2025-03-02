package Alpha_5_Sorting;

import java.util.Arrays;
import java.util.Collections;

import Alpha_4_Arrays.CWH_2_Linear_Search;

public class CWH_4_Inbuilt_Sorting extends CWH_2_Linear_Search {
    public static void main(String[] args) {

        int[] arr = { 22, 33, 11, 4, 2, 5, 34, 4, 20, 83 };
        Integer[] arr1 = { 42, 3, 141, 46, 92, 15, 4, 24, 20, 83 };

        // O(n log n)

        // In Ascending Order :
        System.out.println("In Ascending Order :");
        Arrays.sort(arr);
        // Arrays.sort(arr, 3, 6);
        display(arr);
        System.out.println();


        
        // In Descending Order : (Using Collection framework)
        System.out.println("In Descending Order : ");
        // Arrays.sort(arr1,  2, 6, Collections.reverseOrder());
        Arrays.sort(arr1, Collections.reverseOrder());

        for (Integer i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
