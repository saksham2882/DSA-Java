package Alpha_06_2D_Array;

public class CWH_03_Diagonal_Sum {

    // Brute Force : O(n^2)
    public static void Diagonal_sum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                // Primary Diagonal :
                if (i == j) {
                    sum += matrix[i][j];
                }

                // Secondary Diagonal : 
                else if (i + j == col - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum : " + sum);
    }


    // Optimal Approach : O(n)
    public static void Diagonal_sum_Optimal(int[][] matrix) {
        int row = matrix.length ;
        int sum = 0;

        for (int i = 0; i < row; i++) {

            // Primary Diagonal:
            sum += matrix[i][i];

            // Secondary Diagonal :
            if (i != row - i-1) {                    // check condition for common element sum.
                sum += matrix[i][row - i - 1];
            }
        }
        System.out.println("Diagonal Sum (Optimal) : " + sum);
    }

    public static void main(String[] args) {

        // Even Array :
        // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };   
        
        // Odd Array :
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6}, { 7, 8, 9} };        


        Diagonal_sum(matrix);
        Diagonal_sum_Optimal(matrix);

    }
}
