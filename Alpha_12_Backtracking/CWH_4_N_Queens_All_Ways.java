package Alpha_12_Backtracking;

public class CWH_4_N_Queens_All_Ways {

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
        for (int i = row - 1, j = column + 1; i >= 0 && j <board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


    static int count = 0;                          // To count number of possible solution.

    public static void nQueens(char board[][], int row) {
        // Base Case:
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        // Column loop
        for (int column = 0; column < board.length; column++) {
            if (isSafe(board, row, column)) {
                board[row][column] = 'Q';          // Placing the Queen in the row.
                nQueens(board, row + 1);           // Call for the next row (function call)
                board[row][column] = 'X';          // Here After backTracking we again Empty the Already sitting Queen and again call for the next possible sitting place.
            }

        }
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
        int n = 4;                                // Both no. of Queens and No. of rows.
        char board[][] = new char[n][n];
        // Initializing (chess board is Empty):
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Now placing Queens:
        nQueens(board, 0);                    // (board, starting row from we placing the queens)
        System.out.println("Total number of Possible ways : " + count);
    }
}