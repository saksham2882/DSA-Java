package Alpha_11_Divide_and_Conquer;

import Alpha_4_Arrays.CWH_2_Linear_Search;

public class CWH_2_Quick_Sort extends CWH_2_Linear_Search {

    // Partition : here we place pivot at the correct place in the original array.
    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];                                // last element be our pivot
        int i = start - 1;                                   // to make place for element smaller than the pivot
        
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Now place pivot at the correct place :
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
    

    // O(n log n)  -> average case.
    // O(n^2) -> worst case.
    public static void quickSort(int arr[], int start, int end) {   

        // Base Case :
        if (start >= end) {
            return;
        }

        // Partition :
        int corPivInd = partition(arr, start, end);         // here we placing the pivot at correct place and do partition in left smaller and right larger.
        quickSort(arr, start, corPivInd - 1);               // call quicksort for the left part of the partition
        quickSort(arr, corPivInd + 1, end);                 // call quicksort for the right part of the partition
    }
    
    public static void main(String[] args) {
        
        int arr[] = { 6, 3, 9, 8, 2, 5, -4};

        display(arr);
        quickSort(arr, 0, arr.length - 1);
        display(arr);
    }
}
