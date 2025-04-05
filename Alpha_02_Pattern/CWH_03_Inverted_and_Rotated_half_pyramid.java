package Alpha_02_Pattern;

import java.util.Scanner;

public class CWH_03_Inverted_and_Rotated_half_pyramid {

    // My Code :
    public static void invertedRotatePyra(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((row - j) >= i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
 
    // Mam Code:
    public static void inverted(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // INVERTED & ROTATED HALF-PYRAMID :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows : ");
        int row = sc.nextInt();

        invertedRotatePyra(row);
        inverted(row);
        sc.close();
    }
}
