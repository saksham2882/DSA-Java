package Alpha_04_Arrays;

public class CWH_05_Reverse_an_Array extends CWH_02_Linear_Search{

    // Reverse Array: O(n)
    public static void reverse_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int[] arr = { 2, 4, 6, 8, 10 };
        int[] arr = { 2, 4, 6, 8, 10, 12};

        display(arr);
        reverse_array(arr);
        display(arr);

    }
}