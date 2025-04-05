package Alpha_06_2D_Array;

public class CWH_02_Spiral_Matrix {

    public static void Spiral_Matrix(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {     // also applicable to n x n , n x m 

            // Note: If (n x n) or (n x m) is odd, not using "<=" may cause boundary issues or duplicate prints. To fix this, we add a condition to stop the loop when columns are exhausted if rows exceed columns.

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {          // Because element already print.
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) { 
                if (startCol == endCol) {          // Because element already print.
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        Spiral_Matrix(matrix);
    }
}