package Alpha_11_Divide_and_Conquer;

public class CWH_01_Merge_Sort_Strings {
    // Merge Sort on Strings (O(n log n))
    public static void mergeSort(String[] arr, int left, int right) {
        // Base case: If only one or zero elements remain, return
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(String arr[], int left, int mid, int right) {
        String temp[] = new String[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (smallerString(arr[i], arr[j])) {      // If left element is smaller, take it first
                temp[k++] = arr[i++];
            } else {                                  // Otherwise, take the right element
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left subArray (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subArray (if any)
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy merged elements back to the original array
        for (int index = 0; index < temp.length; index++) {
            arr[left + index] = temp[index];
        }
    }

    // compare two strings lexicographically
    public static boolean smallerString(String s1, String s2) {
        return s1.compareTo(s2) < 0;                  // Returns true if s1 comes before s2
    }

    public static void main(String[] args) {
        String[] arr = { "marks", "mars", "memory", "mark", "marker", "motion" };

        mergeSort(arr, 0, arr.length - 1);

        for (String str : arr) {
            System.out.println(str);
        }
    }
}