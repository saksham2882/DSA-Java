package Alpha_12_Backtracking;

public class CWH_07_Sudoku_solution {

    public static boolean isSafe(int sudoku[][], int row, int column, int digit) {
        // Check in column:
        for (int i = 0; i <= 8; i++) {                           // "0" based index
            if (sudoku[i][column] == digit) {
                return false;
            }
        }
        
        // check in row:
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check in grid:
        int starting_row = (row / 3) * 3;
        int starting_column = (column / 3) * 3;
        // Now in 3 X 3 Grid check for Element 
        for (int i = starting_row; i < starting_row + 3; i++) {
            for (int j = starting_column; j < starting_column + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int column) {
        
        // Base case:
        if (row == 9) {
            return true;
        }

        // Recursion:
        int nextRow = row, nextColumn = column + 1;
        if (column + 1 == 9) {
            nextRow = row + 1;
            nextColumn = 0;
        }

        // Condition for Already Placed.
        if (sudoku[row][column] != 0) {                                 // Means if any element if already placed so no need to place it then call for the next Element.
            return sudokuSolver(sudoku, nextRow, nextColumn);
        }

        // Condition for the Placing Element.
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, column, digit)) {
                sudoku[row][column] = digit;                            // Place Element
                if (sudokuSolver(sudoku, nextRow, nextColumn)) {        // If it return "true" then solution exists.
                    return true;
                }
                sudoku[row][column] = 0;                                // Not Place Element at that Place 
            }
        }
        
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        // Value from 1 to 9 show Element placed and "0" show place is Empty.
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exists.");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exists.");
        }
    }
}