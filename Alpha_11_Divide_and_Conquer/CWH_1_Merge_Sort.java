package Alpha_11_Divide_and_Conquer;

import Alpha_4_Arrays.CWH_2_Linear_Search;

public class CWH_1_Merge_Sort extends CWH_2_Linear_Search {

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // Copy left part:
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy right Part:
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy temp to Original Array:
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        // Base Case:
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(arr, 0, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        
        int arr[] = { 6, 3, 9, 5, 2, 8, -2};

        display(arr);
        mergeSort(arr, 0, arr.length-1);
        display(arr);
    }
}