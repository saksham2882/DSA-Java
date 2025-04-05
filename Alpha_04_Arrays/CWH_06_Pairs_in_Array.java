package Alpha_04_Arrays;

public class CWH_06_Pairs_in_Array {
    
    // Pairs in a array : O(n^2)
    public static void Pairs_in_array(int[] arr) {
        int n = arr.length;
        int total = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                total++;
            }
            System.out.println();
        }
        
        System.out.println("Number of all Possible Pair : " + total);
    }
  
    public static void main(String[] args) {
        
        // int[] arr = { 12, 23, 34, 1, 45, 10, 90, 34, 11 };
        int[] arr = { 2, 4, 6, 8, 10 };

        Pairs_in_array(arr);
    }
}
