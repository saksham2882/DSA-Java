package Alpha_2_Pattern;

import java.util.Scanner;

public class CWH_2_Hollow_ {

    public static void hollowRect(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Hollow Rectangle Pattern :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter No. of Column: ");
        int col = sc.nextInt();

        hollowRect(row, col);

        sc.close();
    }
}