package Alpha_12_Backtracking;

public class CWH_01_Backtracking_on_Array {

    public static void changeArr(int arr[], int index, int value) {
        // Base case:
        if (index == arr.length) {
            System.out.println("Till Base Case Array : ");
            printArr(arr);
            return;
        }

        // Recursion:
        arr[index] = value;
        changeArr(arr, index + 1, value + 1);        // Call for next element (function call step)
        arr[index] = arr[index] - 2;                 // Decrease by 2 when return (backtracking step)
    }
    
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        System.out.println("Main function Array After return : ");
        printArr(arr);
    }
}
