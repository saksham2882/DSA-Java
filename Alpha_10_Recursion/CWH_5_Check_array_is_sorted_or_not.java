package Alpha_10_Recursion;

public class CWH_5_Check_array_is_sorted_or_not {

    // T.C : O(n)
    public static boolean isSorted(int[] arr, int i) {
        // Base condition :
        if (i == arr.length - 1) {
            return true;
        }

        // check :
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 32, 4, 5, 6 };
        // int[] arr = {6 };

        System.out.println(isSorted(arr, 0));
    }
}
 