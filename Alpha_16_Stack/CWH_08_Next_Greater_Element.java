package Alpha_16_Stack;
import java.util.Stack;

public class CWH_08_Next_Greater_Element {

    // Method 1. Using Brute force Approach: O(n^2)

    // Method 2. Using Stack Approach:  O(n)
    public static void findNextGreater(int arr[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {              // for (next Greater element in Right direction) ( if asking for next Greater element in left direction -> then only change the for loop condition from i = 0 to i < arr.length)
            
            // step 1. While loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {    // In Stack, we will push the "index" instead of the element, making it easier to access the element.
                s.pop();
            }

            // step 2. if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            } 

            // step 3. push Element index in stack
            s.push(i);
        }
    }

    public static void main(String[] args) {
        // Find the next Greater Element ( In Right Direction ) for the each Element in the Array. Assume array element are >= 0.

        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];

        findNextGreater(arr, nextGreater);

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println("Original Element: " + arr[i] + " -> " + "Next Greater Element: " + nextGreater[i]);
        }


        // Some Similar Type Question :
        // 1. next Greater in Right : => Above code
        // 2. next Greater in Left : => For loop condition change
        // 3. next Smaller in Right : => so only change in above while loop  i.e. arr[s.peek()] >= arr[i]   (means here we remove larger element from stack)
        // 4. next Smaller in Left : => only change in for loop condition of above 3rd case. 
    }
}