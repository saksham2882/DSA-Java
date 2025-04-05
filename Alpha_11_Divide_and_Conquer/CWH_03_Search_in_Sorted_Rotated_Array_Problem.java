package Alpha_11_Divide_and_Conquer;

public class CWH_03_Search_in_Sorted_Rotated_Array_Problem {

    // Problem : Search in Rotated sorted Array.
    // Sorted, Rotated array with the distinct numbers (in ascending order). It is rotated at a pivot point. Find the index of the given Element.
    public static int search(int arr[], int target, int start, int end) {

        // Base case: element not exists in array.
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Found at mid :
        if (arr[mid] == target) {
            return mid;
        }

        // Mid on Line 1:
        if (arr[start] <= arr[mid]) {
            // Case a: target on the Left part of the Line 1:
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);  
            }
            // Case b: target on the right part of the mid (means it include right part of L1 and complete L2 line.)
            else {
                return search(arr, target, mid + 1, end);
            }

        }
        
        // Mid on Line 2:
        else {
            // Case a: target on the right part of the Line 2:
            if (arr[mid] <= target && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            }
            // Case b: target on the left part of the mid (means it include left part of L2 and complete L1 line.)
            else {
                return search(arr, target, start, mid - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        int targetIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIndex);
    }
}