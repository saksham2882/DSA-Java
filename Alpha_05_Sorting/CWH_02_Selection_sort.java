package Alpha_05_Sorting;

import Alpha_04_Arrays.CWH_02_Linear_Search;

public class CWH_02_Selection_sort extends CWH_02_Linear_Search{

    // Selection Sort :
    public static void Selection_sort(int[] arr) {
        int passes = 0;
        int n = arr.length;
        int already_sort = 0;

        for (int i = 0; i < n-1; i++) {
            int minPos = i;
            already_sort = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                    already_sort = 0;
                }
            }

            passes++;
            if (already_sort == 1) {
                break;
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Total Passes: " + passes);
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 1, 3, 2 };
        int[] arr1 = { 11, 12, 13, 14, 15 };

        Selection_sort(arr);
        display(arr);
        Selection_sort(arr1);
        display(arr1);
    }
}
