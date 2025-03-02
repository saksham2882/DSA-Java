package Alpha_4_Arrays;

import java.util.Arrays;

public class CWH_3_Find_the_Largest_no_in_array extends CWH_2_Linear_Search {

    // Method 1:
    public static int largest(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // Method 2:
    public static int largest_WOM(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method 3:
    public static void largest_US(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Largest Element : " + arr[arr.length - 1]);
    }
    
    // Mam Code:
    public static int Mam_largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element : " + min);
        return max;
    }


    public static void main(String[] args) {

        int[] arr = { 12, 23, 34, 1, 45, 10, 90, 34, 11 };
        // int[] arr = { -12, -23, -34, -13, -45, -10, -90, -34, -11 }; // In this case above two method fails because we initialize max = 0;

        display(arr);
        System.out.println("Largest Element : " + largest(arr));
        System.out.println("Largest Element : " + largest_WOM(arr));
        largest_US(arr);
        System.out.println("Largest Element : " + Mam_largest(arr));
    }
}
