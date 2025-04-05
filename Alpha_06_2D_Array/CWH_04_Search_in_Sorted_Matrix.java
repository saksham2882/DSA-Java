package Alpha_06_2D_Array;

public class CWH_04_Search_in_Sorted_Matrix {

    // Brute Force : O(n^2)
    public static void Search_in_Sorted_Matrix(int[][] matrix , int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element Found at index : " + "(" + i + ", " + j + ")");
                }
            }
        }
    }


    // StairCaseSearch :    O(n + m)  =~ O(n)   OR =~ O(m)

    //  [A] : here we consider "top right most" value as a starting point.
    public static boolean StairCaseSearch_with_Top_right_most(int[][] matrix, int target) { 
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element Found at index (using Top right most): " + "(" + row + ", " + col + ")");
                return true;
            }

            else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Element Not Found.");
        return false;
    }
    

    // [B] : here we consider "bottom left most" value as a starting point.
    public static boolean StairCaseSearch_with_Bottom_Left_Most(int[][] matrix, int target) {
        int col = 0, row = matrix.length - 1;

        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element Found at index (using Top right most): " + "(" + row + ", " + col + ")");
                return true;
            } else if (target < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Element Not Found.");
        return false;
    }

    public static void main(String[] args) {
        
        // This  matrix is sorted row wise and also column wise: 
        int[][] matrix = { { 10, 20, 30, 40 },
                           { 15, 25, 35, 45 },
                           { 27, 29, 37, 48 },
                           { 32, 33, 39, 50 } };
        
        int target = 33;

        // Search  for a key in row wise and column wise sorted matrix.

        System.out.println();
        System.out.println("Brute force Approachc : ");
        Search_in_Sorted_Matrix(matrix, target);
        System.out.println();

        System.out.println("Stair Case Search (Top right most) :");
        StairCaseSearch_with_Top_right_most(matrix, target);
        System.out.println();

        System.out.println("Stair Case Search (Bottom Left most) :");
        StairCaseSearch_with_Bottom_Left_Most(matrix, target);
    }
} 