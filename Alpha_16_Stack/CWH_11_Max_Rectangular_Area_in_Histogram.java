package Alpha_16_Stack;
import java.util.Stack;

public class CWH_11_Max_Rectangular_Area_in_Histogram {

    // T.C : O(n)
    public static void maxArea(int arr[]) {      
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Step 1:  Next Smaller Right: insert or push or pop index of element.
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;   // here we insert index in array. and if not exist smaller in right then we insert the arr.length for calculate width.
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        // Step 2: Next Smaller Left:  here we insert or push or pop index of element.
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        // Step 3: Current Area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Max Area in histogram: " + maxArea);
    }
    
    public static void main(String[] args) {
        
        int arr[] = { 2, 1, 5, 6, 2, 3 };

        maxArea(arr);
    }
}
 