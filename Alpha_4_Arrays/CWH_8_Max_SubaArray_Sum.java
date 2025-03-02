package Alpha_4_Arrays;

public class CWH_8_Max_SubaArray_Sum {

    // Brute Force Approach : O(n^3)
    public static int Max_SubArray_Sum(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                // System.out.print(sum + "  ");
                max = Math.max(max, sum);
            }
        }
        return max;
    }


    // Prefix Sum Approach : O(n^2)
    public static int Max_SubArray_Sum_Using_Prefix_Array_Sum(int[] arr) {

        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];          // Prefix Array 

        prefix[0] = arr[0];                          // set initial index value int prefix array.
        // Calculate prefix array :
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }


        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                
                currSum = i == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                max = Math.max(max, currSum);
            }
        }
        return max;
    }


    // If all elements are in Array is -ve.
    public static boolean isNegativeArray(int[] num) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                return false;
            } 
            else {
                minSum = Math.min(minSum, num[i]);
            }
        }
        System.out.println("Max Element : " + minSum);
        return true;
    }

    // Using Kadanes Algorithm :  O(n)
    public static int Kadanes(int[] num) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < num.length; i++) {

            if (isNegativeArray(num)) {
                return i ;
            }
            else if (currSum + num[i] < 0) {
                currSum = 0;
            } else {
                currSum += num[i];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {

        int[] arr = { 1, -2, 6, -1, 3 };
        // int[] num = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int[] num = { -2, -3, -4, -1, -2, -5, -3 };

        System.out.println("\nMax SubArray Sum : " + Max_SubArray_Sum(arr));

        System.out.println("Max SubArray Sum (Prefix Array) : " + Max_SubArray_Sum_Using_Prefix_Array_Sum(arr));

        System.out.println("Using Kadanes Algorithm :");
        System.out.println("Max SubArray Sum : " + Kadanes(num));
    }
}



// Also use this in place of Math.max() :
// if(sum > max){
//    max=sum;
// }