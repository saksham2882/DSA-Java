package Alpha_10_Recursion;

public class CWH_06_First_Occurrence {

    // WAP to find the "First occurrence" of an element in ana array :
    public static int first_Occurrence(int[] arr, int element, int index) {           // O(n) for both.

        // Base case:
        if (index == arr.length) {
            return -1;
        }
        // check :
        if (arr[index] == element) {
            return index;
        }
        return first_Occurrence(arr, element, index + 1);
    }


    public static void main(String[] args) {
        
        int arr[] = { 2, 9, 7, 8, 9, 10, 8, 4, 7, 10, 11, 45, 9, 7};

        System.out.println("First Occurrence: " + first_Occurrence(arr, 10, 0));
       
    }
}