package Alpha_2_Pattern;

import java.util.Scanner;

public class CWH_7_Butterfly_Pattern {

    public static void Butterfly(int row) {
        //1st half :
        for (int i = 1; i <= row; i++) {

            // Star :
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces :
            for (int j = 1; j <= (2 * (row - i)); j++) {
                System.out.print("  ");
            }

            // Star :
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half :
        for (int i = row; i > 0; i--) {

            // Star :
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces :
            for (int j = 1; j <= (2 * (row - i)); j++) {
                System.out.print("  ");
            }

            // Star :
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows: ");
        int row = sc.nextInt();

        Butterfly(row);

        sc.close();

    }
}
