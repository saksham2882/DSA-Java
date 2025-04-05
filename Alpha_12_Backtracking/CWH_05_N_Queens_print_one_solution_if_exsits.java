package Alpha_12_Backtracking;

public class CWH_05_N_Queens_print_one_solution_if_exsits {
    
    public static boolean isSafe(char board[][], int row, int column) {
        // check for vertical up:
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        // check for left diagonal up:
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // check for right diagonal up:
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // Base Case:
        if (row == board.length) {
            // printBoard(board);
            return true;
        }

        // Column loop
        for (int column = 0; column < board.length; column++) {
            if (isSafe(board, row, column)) {
                board[row][column] = 'Q';                // Placing the Queen in the row.
                if (nQueens(board, row + 1)) {           // Call for the next row (Q(n-1)) (if solution exist then return true.)
                    return true;
                }
                board[row][column] = 'X';                // Otherwise if solution not exists for the Q(n-1) then unPlace the queen and again call for the next possible sitting place.
            }
        }
        return false; // for none solution exists. 
    }
    // Print Board:
    public static void printBoard(char board[][]) {
        System.out.println("------------- CHESS BOARD ------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;                                     // Both no. of Queens and No. of rows.
        char board[][] = new char[n][n];
        // Initializing (chess board is Empty):
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Now placing Queens:
        if (nQueens(board, 0)) {
            System.out.println("\nsolution is possible");
            printBoard(board);
        }
        else {
            System.out.println("\nSolution is not possible");
        }
    }
}
