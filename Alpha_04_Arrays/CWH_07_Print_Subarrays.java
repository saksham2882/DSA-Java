package Alpha_04_Arrays;

public class CWH_07_Print_Subarrays {

    // Print SubArrays:
    public static void Print_SubArray(int[] arr) {

        int total = 0;

        for (int i = 0; i < arr.length; i++) {           // Start
            for (int j = i; j < arr.length; j++) {       // End Point
                int sum = 0;

                for (int k = i; k <= j; k++) {           // Print
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.print("\nThe Sum of SubArray : " + sum);
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Possible SubArray Pair : " + total);
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };

        Print_SubArray(arr);
    }
}
