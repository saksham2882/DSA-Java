package Alpha_4_Arrays;

public class CWH_4_Binary_Search {

    // Binary Search : O(log n)
    public static void Binary_Search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        for (int i = low; i <= high; i++) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 12, 23, 34, 45, 47, 90, 340, 700 };
        // int[] arr = { 1290, 963, 874, 545, 447, 390, 240, 100 };

        Binary_Search(arr, 340);

    }
}
