package Alpha_2_Pattern;

import java.util.Scanner;

public class CWH_10_Diamond {

    public static void Diamond(int row) {
        // 1st Half:
        for (int i = 1; i <= row; i++) {
            // Spaces:
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            // Star :
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd Half :
        for (int i = row; i > 0; i--) {
            // Spaces:
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            // Star :
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of rows: ");
        int row = sc.nextInt();

        Diamond(row);
        
        sc.close();
    }
}
