package Alpha_6_2D_Array;

import java.util.Scanner;

public class CWH_1_Creation_of_2D_Array {

    // Display :
    public static void display(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Searching :
    public static void search(int[][] matrix, int key) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Elment Found at index : " + "(" + i + ", " + j + ")");
                }
            }
        }
    }

    // Largest Element : 
    public static void Largest_and_Smallest_Element(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                largest = Math.max(largest, matrix[i][j]);
                Smallest = Math.min(Smallest, matrix[i][j]);
            }
        }
        System.out.println("Largest Element : " + largest);
        System.out.println("Smallest Element : " + Smallest);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        // int row = 3, col = 3;
        int row = matrix.length, col = matrix[0].length;

        System.out.println("Enter Matrix No. : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display :
        display(matrix, row, col);
        search(matrix, 4);
        Largest_and_Smallest_Element(matrix);

        sc.close();
    }
}