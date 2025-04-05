package Alpha_10_Recursion;

public class CWH_07_Last_Occurrence {

    // WAP to find the "Last occurrence" of an element in ana array :
    // O(n) for both.
    public static int last_Occur(int[] arr, int element, int index) {
        
        // Base Case:
        if (index == arr.length) {  
            return -1;
        }
        
        // check forward:
        int isFound = last_Occur(arr, element, index + 1);
        if (isFound == -1 && arr[index] == element) {
            return index;
        }

        return isFound;
    }

    public static void main(String[] args) {

        int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3, 8, 5, 9, 10, 7 };
        int[] arr1 = { 5, 5, 5, 5, 5 };

        System.out.println("Last Occurrence: " + last_Occur(arr, 5, 0));
        System.out.println("Last Occurrence: " + last_Occur(arr1, 5, 0));
    }
}
